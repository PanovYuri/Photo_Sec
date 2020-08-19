package com.example.photosec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val COUNTRIES = arrayListOf<String>("Local Storage", "Google Disk", "Yandex Disk", "Dropbox")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(
            this,
            R.layout.dropdown_menu_popup_item,
            COUNTRIES
        )
        menu_list_storage.setAdapter(adapter)
        menu_list_storage.setText(COUNTRIES[0], false)
    }
}