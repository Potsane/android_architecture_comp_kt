package com.baracoin.contactsmanager.injection

import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by PMohale on 2018/06/10.
 */

@Module(includes = [(AndroidSupportInjectionModule::class), (ViewModelModule::class)])
private object ContactsManagerModule {
}