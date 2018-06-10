package com.baracoin.contactsmanager.database

import android.arch.persistence.room.Database
import com.baracoin.contactsmanager.database.dao.ContactDao
import com.baracoin.contactsmanager.entity.Contact

/**
 * Created by PMohale on 2018/06/10.
 */

@Database(entities = arrayOf(Contact::class), version = 1)
abstract class ContactManagementDatabase {

    abstract fun contactDao(): ContactDao
}