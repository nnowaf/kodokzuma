package com.nanyo.kodokzuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nanyo.kodokzuma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityBinding.root)

        activityBinding.button.setOnClickListener {
            startActivity(Intent(this, HalamanUtama::class.java)).also {
                finish()
            }
        }
    }
}