package com.example.gmail

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = arrayListOf<MailModel>()

        itemList.add(MailModel(R.drawable.e, "Edurila.com", "\$19 Only (First 10 spots) - Bestselling...\n" +
                "Are you looking to Learn Web Designin...", "12:34 PM"))

        itemList.add(MailModel(R.drawable.c, "Chris Abad", "Help make Campaign Monitor better\n" +
                "Let us know your thoughts! No Images...", "11:22 AM"))

        itemList.add(MailModel(R.drawable.t, "Tuto.com", "8h de formation gratuite et les nouvea...\n" +
                "Photoshop, SEO, Blender, CSS, WordPre...", "11:04 AM"))

        itemList.add(MailModel(R.drawable.s, "support", "Société Ovh : suivi de vos services - hp...\n" +
                "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"))

        itemList.add(MailModel(R.drawable.m, "Matt from lonic", "The New lonic Creator Is Here!\n" +
                "Announcinq the all-new Creator, build...", "09:34 PM"))

        itemList.add(MailModel(R.drawable.l, "LinkedIn", "MBBank and others share their thoughts\n" +
                "on LinkedIn", "08:56 PM"))

        itemList.add(MailModel(R.drawable.y, "Your brother",
                "Are you looking", "08:02 PM"))

        itemList.add(MailModel(R.drawable.m, "Mom",
                "...", "08:02 PM"))

        itemList.add(MailModel(R.drawable.h, "Hello, Im",
                "No say thankyou", "08:02 PM"))

        itemList.add(MailModel(R.drawable.j, "Joey", "Introducing creator monetization on Poe\n" +
                "What is going on", "08:02 PM"))

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = MailAdapter(itemList)
    }
}