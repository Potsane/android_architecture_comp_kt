package com.baracoin.contactsmanager.view.list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baracoin.contactsmanager.R
import com.baracoin.contactsmanager.entity.Contact

/**
 * Created by PMohale on 2018/06/12.
 */
class ContactsListAdaptor constructor(private var contacts: List<Contact>, private val deleteClickListener: View.OnClickListener) : RecyclerView.Adapter<ContactViewHolder>() {

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.emailTextView.text = contact.email
        holder.nameTextView.text = contact.name
        holder.telephoneTextView.text = contact.telephone

        holder.itemView.tag = contact
        holder.deleteButton.tag = contact
        holder.deleteButton.setOnClickListener(deleteClickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    fun setContacts(contacts: List<Contact>) {
        this.contacts = contacts
        notifyDataSetChanged()
    }
}