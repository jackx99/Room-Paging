package com.solosen.roompaging.database

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.solosen.roompaging.person.Person

@Dao
interface PersonDao {

    @Insert
    fun addPerson(person: Person)

    @Query("SELECT * FROM Person")
    fun person(): DataSource.Factory<Int, Person?>
}
