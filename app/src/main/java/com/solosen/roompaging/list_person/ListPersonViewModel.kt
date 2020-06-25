package com.solosen.roompaging.list_person

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import androidx.paging.toLiveData
import com.solosen.roompaging.database.PersonDatabase
import com.solosen.roompaging.person.Person
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class ListPersonViewModel(val context: Context) : ViewModel() {
    private lateinit var personPagedListLiveData: LiveData<PagedList<Person?>>

    fun getPersonPagedList() {
        val personDao = PersonDatabase.create(context)
            .personDao()
        runBlocking {
            personPagedListLiveData = withContext(Dispatchers.Default) {
                val config = PagedList.Config.Builder()
                    .setPageSize(10)
                    .setEnablePlaceholders(false)
                    .build()
                personDao.person().toLiveData(config)
            }
        }
    }

    fun putPersonPagedList() = personPagedListLiveData
}
