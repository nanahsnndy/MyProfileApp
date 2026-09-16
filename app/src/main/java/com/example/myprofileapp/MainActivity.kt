package com.example.myprofileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //launcher
    private val editProfileLauncher =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->

            if (result.resultCode == RESULT_OK) {

                val data = result.data

                val name = data?.getStringExtra("name")
                val bio = data?.getStringExtra("bio")

                if (name != null) {
                    findViewById<TextView>(R.id.tvName).text = name
                }

                if (bio != null) {
                    findViewById<TextView>(R.id.tvBio).text = bio
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //penggunaaan startActivity, biar foto profil bisa dipencet
        val imgProfile = findViewById<ImageView>(R.id.imgProfile)

        imgProfile.setOnClickListener {

            val intent = Intent(
                this,
                PhotoDetailActivity::class.java
            )

            startActivity(intent)
        }

        val editProfile = findViewById<Button>(R.id.btnEditProfile)
        val shareProfile = findViewById<Button>(R.id.btnShareProfile)

        editProfile.setOnClickListener {

            val intent = Intent(
                this,
                EditProfileActivity::class.java
            )

            intent.putExtra(
                "name",
                findViewById<TextView>(R.id.tvName).text.toString()
            )

            intent.putExtra(
                "bio",
                findViewById<TextView>(R.id.tvBio).text.toString()
            )

            // laucher
            editProfileLauncher.launch(intent)
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