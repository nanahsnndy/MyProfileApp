package com.example.myprofileapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val editProfile = findViewById<Button>(R.id.btnEditProfile)
        val shareProfile = findViewById<Button>(R.id.btnShareProfile)

        editProfile.setOnClickListener {
            Toast.makeText(
                this,
                "Edit Profile clicked",
                Toast.LENGTH_SHORT
            ).show()
        }

        shareProfile.setOnClickListener {
            Toast.makeText(
                this,
                "Profile siap dibagikan!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}