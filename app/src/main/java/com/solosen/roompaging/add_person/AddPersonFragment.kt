package com.solosen.roompaging.add_person

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.solosen.roompaging.R
import com.solosen.roompaging.database.PersonDatabase
import com.solosen.roompaging.person.Person
import kotlinx.android.synthetic.main.fragment_add_person.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddPersonFragment : Fragment() {
    private val viewModel: AddPersonViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_person, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_save.setOnClickListener {
            val firstName = edit_text_first_name.text?.toString()
            val lastName = edit_text_last_name.text?.toString()
            if (firstName != null && firstName.isBlank()) {
                input_layout_first_name.error = "Please enter your first name."
                return@setOnClickListener
            }
            if (lastName != null && lastName.isBlank()) {
                input_layout_last_name.error = "Please enter your last name."
                return@setOnClickListener
            }
            val person = Person(
                firstName = firstName!!,
                lastName = lastName!!
            )
            viewModel.setPerson(person)
            Toast.makeText(requireContext(), "Added", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
