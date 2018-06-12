package com.baracoin.contactsmanager.view.list

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.baracoin.contactsmanager.R
import com.baracoin.contactsmanager.entity.Contact
import com.baracoin.contactsmanager.injection.ContentsManagerViewModelFactory
import kotlinx.android.synthetic.main.activity_contacts_list.*
import javax.inject.Inject

class ContactsListActivity : AppCompatActivity() {

    private lateinit var contactListAdaptor: ContactsListAdaptor
    private lateinit var contactListViewModel: ContactListViewModel
    @Inject
    lateinit var contactsManagerViewModelFactory: ContentsManagerViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts_list)
        setSupportActionBar(toolbar)
        setupViewModel()
        setupRecyclerView()
        setupButtons()
    }

    private fun setupViewModel() {
        contactListViewModel = ViewModelProviders.of(this, contactsManagerViewModelFactory).get(ContactListViewModel::class.java)

        contactListViewModel.getAllContacts().observe(this, Observer { response ->
            if (response != null) {
                contactListAdaptor.setContacts(response)
            }
        })

    }

    private fun setupRecyclerView() {
        val contactsRecyclerView = findViewById<RecyclerView>(R.id.recycler_view_contact_items)
        contactsRecyclerView.layoutManager = LinearLayoutManager(this)

        contactListAdaptor = ContactsListAdaptor(ArrayList(), deleteClickListener)
        contactsRecyclerView.adapter = contactListAdaptor
    }

    private val deleteClickListener = View.OnClickListener { view: View ->
        val contact: Contact = view.tag as Contact
        contactListViewModel.deleteContact(contact)
    }

    private fun setupButtons() {
        fab.setOnClickListener { view ->
            val intent = Intent(this, AppCompatActivity::class.java)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_contacts_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
