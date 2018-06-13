package com.baracoin.contactsmanager.injection

import android.arch.lifecycle.ViewModelProvider
import com.baracoin.contactsmanager.view.add.AddContactViewModel
import com.baracoin.contactsmanager.view.list.ContactListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by PMohale on 2018/06/10.
 */

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ContactListViewModel::class)
    abstract fun bindContactListViewModel(contactListViewModel: ContactListViewModel): ContactListViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AddContactViewModel::class)
    abstract fun bindAddContactViewModel(addContactViewModel: AddContactViewModel): AddContactViewModel


    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ContactsManagerViewModelFactory): ViewModelProvider.Factory
}