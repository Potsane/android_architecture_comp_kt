package com.baracoin.contactsmanager.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.baracoin.contactsmanager.entity.Contact

/**
 * Created by PMohale on 2018/06/10.
 */

@Dao
interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addContact(contact: Contact)

    @Query("SELECT * FROM contact")
    fun getAllContacts(): LiveData<List<Contact>>

    @Delete
    fun deleteContact(contact: Contact)
}