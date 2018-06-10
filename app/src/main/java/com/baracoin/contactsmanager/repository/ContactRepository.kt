package com.baracoin.contactsmanager.repository

import android.arch.lifecycle.LiveData
import com.baracoin.contactsmanager.entity.Contact
import io.reactivex.Completable

/**
 * Created by PMohale on 2018/06/10.
 */
interface ContactRepository {

    fun getAllContacts(): LiveData<List<Contact>>
    fun deleteContact(contact: Contact): Completable
    fun addContact(contact: Contact): Completable
}