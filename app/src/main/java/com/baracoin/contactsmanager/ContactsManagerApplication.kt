package com.baracoin.contactsmanager

import android.app.Activity
import android.app.Application
import android.content.Context
import com.baracoin.contactsmanager.injection.AppInjector
import com.baracoin.contactsmanager.injection.ContactsManagerComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by PMohale on 2018/06/11.
 */

open class ContactsManagerApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        initializeApplication()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    open fun initializeApplication() {
        ContactsManagerComponent.builder().application(this)
                .build().inject(this)

        AppInjector.init(this)
    }
}