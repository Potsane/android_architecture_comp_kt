package com.baracoin.contactsmanager.view.add

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.baracoin.contactsmanager.R
import com.baracoin.contactsmanager.entity.Contact
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_add_contact.*
import javax.inject.Inject

class AddContactActivity : AppCompatActivity() {

    private lateinit var addContactViewModel: AddContactViewModel
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)
        setupViewModel()
    }

    fun addContact() {
        println("GETS HERE")
        addContactViewModel.addContact(constructContact())
    }

    private fun setupViewModel() {
        addContactViewModel = ViewModelProviders.of(this, viewModelFactory).get(AddContactViewModel::class.java)
    }

    private fun constructContact(): Contact {
        return Contact(edit_text_name.text.toString(), edit_text_name.text.toString(), edit_text_name.text.toString())
    }
}
