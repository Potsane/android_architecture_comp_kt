package com.baracoin.contactsmanager.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by PMohale on 2018/06/10.
 */
@Entity(tableName = "contact")
class Contact(var name: String, @PrimaryKey var email: String, var telephone: String)