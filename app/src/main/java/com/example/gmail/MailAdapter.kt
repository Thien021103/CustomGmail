package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gmail.MailModel

class MailAdapter(val items : ArrayList<MailModel>) : BaseAdapter() {
    override fun getCount(): Int = items.size

    override fun getItem(p0: Int): Any = items[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val mailbox: View = LayoutInflater.from(p2?.context).inflate(R.layout.mail_box, p2, false)

        val avatarView = mailbox.findViewById<ImageView>(R.id.avatar)
        val titleView = mailbox.findViewById<TextView>(R.id.title)
        val contentView = mailbox.findViewById<TextView>(R.id.content)
        val timeView = mailbox.findViewById<TextView>(R.id.time)

        avatarView.setImageResource(items[p0].avatar)
        titleView.text = items[p0].title
        contentView.text = items[p0].content
        timeView.text = items[p0].time

        return mailbox
    }

}