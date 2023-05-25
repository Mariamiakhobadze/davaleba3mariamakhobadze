package com.example.group1FirebaseProject

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ProfileActivity : AppCompatActivity() {
    private var btnExit: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        btnExit = findViewById(R.id.btnExit)
        btnExit.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}

class ProfileWithUpd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_with_upd)
    }
}