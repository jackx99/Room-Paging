package com.solosen.roompaging

import com.solosen.roompaging.add_person.AddPersonViewModel
import com.solosen.roompaging.list_person.ListPersonViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val myModule = module {
    viewModel { ListPersonViewModel(androidContext()) }
    viewModel { AddPersonViewModel(androidContext()) }
}
