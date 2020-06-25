package com.solosen.roompaging

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.solosen.roompaging.person.Person
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PagingTest {

    @Test
    fun insertMultiplePersonsData() {
        ActivityScenario.launch(MainActivity::class.java)
        Espresso.onView(ViewMatchers.withId(R.id.fab_add_person))
            .perform(ViewActions.click())
        val personList = listOf(
            Person(firstName = "Hunter", lastName = "Arnorld"),
            Person(firstName = "Desmond", lastName = "Garcia"),
            Person(firstName = "Jaida", lastName = "Lewis"),
            Person(firstName = "Stephanie", lastName = "Davis"),
            Person(firstName = "Jarrett", lastName = "Rowe"),
            Person(firstName = "Gavin", lastName = "Rollins"),
            Person(firstName = "Fiona", lastName = "Moss"),
            Person(firstName = "Scott", lastName = "Harmon"),
            Person(firstName = "Brittany", lastName = "Mendez"),
            Person(firstName = "Aubrey", lastName = "Black"),
            Person(firstName = "Katie", lastName = "Potter"),
            Person(firstName = "Rylan", lastName = "Flores"),
            Person(firstName = "Kendrick", lastName = "Ortiz"),
            Person(firstName = "Mckinley", lastName = "Wheeler"),
            Person(firstName = "Boston", lastName = "Fleming"),
            Person(firstName = "Yazmin", lastName = "Deleon"),
            Person(firstName = "Kaylin", lastName = "Hayes"),
            Person(firstName = "Jazlene", lastName = "Carson"),
            Person(firstName = "Madden", lastName = "Herman"),
            Person(firstName = "Colbey", lastName = "Bartlett"),
            Person(firstName = "Cruz", lastName = "Dominguez"),
            Person(firstName = "Braylen", lastName = "Hodge"),
            Person(firstName = "Kali", lastName = "Ward"),
            Person(firstName = "Malaki", lastName = "Allison"),
            Person(firstName = "Yasmine", lastName = "Russell"),
            Person(firstName = "Mercedes", lastName = "Wilkinson"),
            Person(firstName = "Ximena", lastName = "Jackson"),
            Person(firstName = "Dominik", lastName = "Todd"),
            Person(firstName = "Avah", lastName = "Trujillo"),
            Person(firstName = "Joanna", lastName = "Schultz"),
            Person(firstName = "Joy", lastName = "Peterson"),
            Person(firstName = "Brady", lastName = "Jacobs"),
            Person(firstName = "Jorden", lastName = "Robbins"),
            Person(firstName = "Kendra", lastName = "Shaffer"),
            Person(firstName = "Ethen", lastName = "Salas"),
            Person(firstName = "Belinda", lastName = "Ray"),
            Person(firstName = "Christina", lastName = "Stone"),
            Person(firstName = "Valentina", lastName = "Mccann"),
            Person(firstName = "Silas", lastName = "Ramirez"),
            Person(firstName = "Rocco", lastName = "Abott"),
            Person(firstName = "Layne", lastName = "Brewer"),
            Person(firstName = "Yosef", lastName = "Johnson"),
            Person(firstName = "Shawn", lastName = "Bentley"),
            Person(firstName = "Mathias", lastName = "Sanford"),
            Person(firstName = "Ayanna", lastName = "Woodward"),
            Person(firstName = "Nicole", lastName = "Andrews"),
            Person(firstName = "Tucker", lastName = "Lambert"),
            Person(firstName = "Barrett", lastName = "Charles"),
            Person(firstName = "Mackenize", lastName = "Ball"),
            Person(firstName = "Addisyn", lastName = "Kent"),
            Person(firstName = "Aliya", lastName = "Lucero"),
            Person(firstName = "Maurice", lastName = "Benjamin"),
            Person(firstName = "John", lastName = "Gaines"),
            Person(firstName = "Yaritza", lastName = "Horn"),
            Person(firstName = "Kaydence", lastName = "Austin"),
            Person(firstName = "Maggie", lastName = "Heath"),
            Person(firstName = "Richard", lastName = "Riddle"),
            Person(firstName = "Aisha", lastName = "Tuner"),
            Person(firstName = "Ray", lastName = "Dodson"),
            Person(firstName = "Jesse", lastName = "Coleman"),
            Person(firstName = "Ryan", lastName = "Dunn"),
            Person(firstName = "Tianna", lastName = "Farley"),
            Person(firstName = "Haylee", lastName = "Copeland"),
            Person(firstName = "Kadyn", lastName = "Sullivan"),
            Person(firstName = "Vicente", lastName = "Arnorld"),
            Person(firstName = "Jayden", lastName = "Andersen"),
            Person(firstName = "Kirsten", lastName = "Lam"),
            Person(firstName = "Danna", lastName = "Mack"),
            Person(firstName = "Beckham", lastName = "Peck"),
            Person(firstName = "Sherlyn", lastName = "Daniel"),
            Person(firstName = "Kenneth", lastName = "Mendoza"),
            Person(firstName = "Kade", lastName = "Flowers"),
            Person(firstName = "Kaydence", lastName = "Galvan"),
            Person(firstName = "Hector", lastName = "Church"),
            Person(firstName = "Bentley", lastName = "Richards"),
            Person(firstName = "Carina", lastName = "Barton"),
            Person(firstName = "Gabriel", lastName = "Sanford"),
            Person(firstName = "Alvin", lastName = "Hurst"),
            Person(firstName = "Cheyanne", lastName = "Velez"),
            Person(firstName = "Jazmin", lastName = "Walls"),
            Person(firstName = "Lilyana", lastName = "Espinoza"),
            Person(firstName = "Rudy", lastName = "Patterson"),
            Person(firstName = "Gideon", lastName = "Warren"),
            Person(firstName = "Leila", lastName = "Krause"),
            Person(firstName = "Maverick", lastName = "George"),
            Person(firstName = "Mollie", lastName = "Cervantes"),
            Person(firstName = "Libby", lastName = "Graham")
        )
        personList.forEach {
            Espresso.onView(ViewMatchers.withId(R.id.edit_text_first_name))
                .perform(ViewActions.typeText(it.firstName))
            Espresso.onView(ViewMatchers.withId(R.id.edit_text_last_name))
                .perform(ViewActions.typeText(it.lastName))
            Espresso.onView(ViewMatchers.withId(R.id.button_save))
                .perform(ViewActions.click())
            Espresso.onView(ViewMatchers.withId(R.id.edit_text_first_name))
                .perform(ViewActions.clearText())
            Espresso.onView(ViewMatchers.withId(R.id.edit_text_last_name))
                .perform(ViewActions.clearText())
        }
    }
}
