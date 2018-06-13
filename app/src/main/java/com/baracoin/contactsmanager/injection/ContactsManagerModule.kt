package com.baracoin.contactsmanager.injection

import android.arch.persistence.room.Room
import com.baracoin.contactsmanager.ContactsManagerApplication
import com.baracoin.contactsmanager.database.ContactManagementDatabase
import com.baracoin.contactsmanager.database.dao.ContactDao
import com.baracoin.contactsmanager.repository.ContactRepository
import com.baracoin.contactsmanager.repository.ContactRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by PMohale on 2018/06/10.
 */

@Module(includes = [(AndroidSupportInjectionModule::class), (ViewModelModule::class)])
open class ContactsManagerModule {


    @Provides
    fun providesContactRepository(contactDao: ContactDao): ContactRepository {
        return ContactRepositoryImpl(contactDao)
    }

    @Provides
    @Singleton
    fun providesContactDao(contactManagementDatabase: ContactManagementDatabase): ContactDao {
        return contactManagementDatabase.contactDao()
    }

    @Provides
    @Singleton
    fun providesContactManagementDatabase(context: ContactsManagerApplication): ContactManagementDatabase {
        return Room.databaseBuilder(context.getApplicationContext(), ContactManagementDatabase::class.java, "contacts").build()
    }

}