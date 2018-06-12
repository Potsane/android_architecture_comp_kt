package com.baracoin.contactsmanager.view.list

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import com.baracoin.contactsmanager.R

/**
 * Created by PMohale on 2018/06/12.
 */
class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    var nameTextView: TextView = view.findViewById(R.id.text_view_name)
    var emailTextView: TextView = view.findViewById(R.id.text_view_email)
    var telephoneTextView: TextView = view.findViewById(R.id.text_view_telephone)
    var deleteButton: ImageButton = view.findViewById(R.id.button_delete)
}