package com.example.myprofileapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val etName = findViewById<EditText>(R.id.etName)
        val etBio = findViewById<EditText>(R.id.etBio)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)

        // Mengambil data lama
        etName.setText(intent.getStringExtra("name"))
        etBio.setText(intent.getStringExtra("bio"))

        btnSimpan.setOnClickListener {

            val name = etName.text.toString()
            val bio = etBio.text.toString()

            val resultIntent = Intent()

            // Mengirim data yang sudah di edit
            resultIntent.putExtra("name", name)
            resultIntent.putExtra("bio", bio)

            // Mengembalikan hasil ke halaman sebelumnya
            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }
    }
}