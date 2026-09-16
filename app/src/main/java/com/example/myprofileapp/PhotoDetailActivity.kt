package com.example.myprofileapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PhotoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_detail)

        val imgPhotoDetail = findViewById<ImageView>(R.id.imgPhotoDetail)
        val tvPhotoName = findViewById<TextView>(R.id.tvPhotoName)
        val btnKembali = findViewById<Button>(R.id.btnKembali)

        imgPhotoDetail.setImageResource(R.drawable.profile)

        tvPhotoName.text = "Nayyara Hasnanindya"

        btnKembali.setOnClickListener {
            finish()
        }
    }
}