package com.baracoin.contactsmanager.injection

import com.baracoin.contactsmanager.view.add.AddContactActivity
import com.baracoin.contactsmanager.view.list.ContactsListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by PMohale on 2018/06/10.
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract  fun bindContactsListActivity(): ContactsListActivity

    @ContributesAndroidInjector
    abstract  fun bindAddContactActivity(): AddContactActivity
}