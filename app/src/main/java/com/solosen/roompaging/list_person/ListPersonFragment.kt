package com.solosen.roompaging.list_person

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.paging.PagedList
import com.solosen.roompaging.R
import com.solosen.roompaging.person.Person
import kotlinx.android.synthetic.main.fragment_list_person.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListPersonFragment : Fragment() {
    private val viewModel: ListPersonViewModel by viewModel()
    private lateinit var personPagedListObserver: Observer<PagedList<Person?>>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_person, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getPersonPagedList()
        val adapter = ListPersonAdapter()
        rcv_person.setHasFixedSize(true)
        rcv_person.adapter = adapter
        personPagedListObserver = viewModel.putPersonPagedList().observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        fab_add_person.setOnClickListener {
            findNavController().navigate(R.id.action_listPersonFragment_to_addPersonFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.putPersonPagedList().removeObserver(personPagedListObserver)
    }
}
