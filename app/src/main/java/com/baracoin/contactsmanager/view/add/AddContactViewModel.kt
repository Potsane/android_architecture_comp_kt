package com.baracoin.contactsmanager.view.add

import com.baracoin.contactsmanager.entity.Contact
import com.baracoin.contactsmanager.repository.ContactRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by PMohale on 2018/06/10.
 */
class AddContactViewModel @Inject constructor(private val contactRepository: ContactRepository) {

    fun addContact(contact: Contact) {
        contactRepository.addContact(contact)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe{}
    }
}