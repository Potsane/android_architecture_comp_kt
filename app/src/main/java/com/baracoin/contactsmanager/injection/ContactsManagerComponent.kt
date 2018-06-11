package com.baracoin.contactsmanager.injection

import com.baracoin.contactsmanager.ContactsManagerApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by PMohale on 2018/06/11.
 */

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (ActivityModule::class), (ContactsManagerModule::class)])
interface ContactsManagerComponent {

    fun inject(contactsManagerApplication: ContactsManagerApplication)

    @Component.Builder
    interface Builder {

        fun contactManagerModule(contactsManagerModule: ContactsManagerModule): Builder

        @BindsInstance
        fun application(application: ContactsManagerApplication): Builder

        fun build(): ContactsManagerComponent
    }
}