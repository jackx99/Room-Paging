package com.solosen.roompaging.list_person

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.solosen.roompaging.R
import com.solosen.roompaging.person.Person

class ListPersonAdapter : PagedListAdapter<Person, ListPersonViewHolder>(DIF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListPersonViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(
                R.layout.item_person,
                parent,
                false
        ) as TextView
        return ListPersonViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ListPersonViewHolder, position: Int) {
        val item = getItem(position)
        val textView = holder.itemView as TextView
        val fullName = "${item?.firstName} ${item?.lastName}"
        textView.text = fullName
    }

    companion object {
        private val DIF_CALLBACK = object : DiffUtil.ItemCallback<Person>() {
            override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
                return oldItem == newItem
            }
        }
    }
}
