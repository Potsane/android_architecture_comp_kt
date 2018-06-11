package com.baracoin.contactsmanager.repository

import android.arch.lifecycle.LiveData
import com.baracoin.contactsmanager.database.dao.ContactDao
import com.baracoin.contactsmanager.entity.Contact
import io.reactivex.Completable
import javax.inject.Inject

/**
 * Created by PMohale on 2018/06/10.
 */
class ContactRepositoryImpl @Inject constructor(private val contactDao: ContactDao) : ContactRepository {

    override fun deleteContact(contact: Contact): Completable {
        return Completable.fromAction { contactDao.deleteContact(contact) }
    }

    override fun addContact(contact: Contact): Completable {
        return Completable.fromAction { contactDao.addContact(contact) }
    }

    override fun getAllContacts(): LiveData<List<Contact>> {
        return contactDao.getAllContacts()
    }
}