package com.baracoin.contactsmanager.repository

import android.arch.lifecycle.LiveData
import com.baracoin.contactsmanager.entity.Contact
import io.reactivex.Completable

/**
 * Created by PMohale on 2018/06/10.
 */
class ContactRepositoryImpl : ContactRepository {

    override fun deleteContact(contact: Contact): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addContact(contact: Contact): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllContacts(): LiveData<List<Contact>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}