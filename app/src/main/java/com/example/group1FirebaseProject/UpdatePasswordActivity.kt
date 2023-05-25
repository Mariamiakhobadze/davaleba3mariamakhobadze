package com.example.group1FirebaseProject

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var currentPasswordEditText: EditText? = null
    private var newPasswordEditText: EditText? = null
    private var changePasswordButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        currentPasswordEditText = findViewById(R.id.current_password_edittext)
        newPasswordEditText = findViewById(R.id.new_password_edittext)
        changePasswordButton = findViewById(R.id.change_password_button)
        changePasswordButton.setOnClickListener(View.OnClickListener {
            val currentPassword = currentPasswordEditText.getText().toString()
            val newPassword = newPasswordEditText.getText().toString()

            
            Toast.makeText(this@MainActivity, "Password updated successfully", Toast.LENGTH_SHORT)
                .show()
        })
    }
}
class UpdatePasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.UpdatePasswordActivity)
    }
}