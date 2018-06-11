package com.baracoin.contactsmanager.view.list

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.baracoin.contactsmanager.entity.Contact
import com.baracoin.contactsmanager.repository.ContactRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by PMohale on 2018/06/10.
 */
class ContactListViewModel @Inject constructor(private val contactRepository: ContactRepository) : ViewModel() {

    fun deleteContact(contact: Contact) {
        contactRepository.deleteContact(contact)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {  }
    }

    fun getAllContacts(): LiveData<List<Contact>> {
        return contactRepository.getAllContacts()
    }
}