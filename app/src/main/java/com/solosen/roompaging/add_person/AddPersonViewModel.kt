package com.solosen.roompaging.add_person

import android.content.Context
import androidx.lifecycle.ViewModel
import com.solosen.roompaging.database.PersonDatabase
import com.solosen.roompaging.person.Person
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class AddPersonViewModel(val context: Context) : ViewModel() {

    fun setPerson(person: Person) {
        runBlocking {
            withContext(Dispatchers.Default) {
                val personDao = PersonDatabase.create(context)
                    .personDao()
                personDao.addPerson(person)
            }
        }
    }
}
