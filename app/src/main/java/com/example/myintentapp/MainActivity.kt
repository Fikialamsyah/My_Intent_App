package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.net.HttpCookie.parse
import java.net.URI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        val btnMoveData: Button = findViewById(R.id.btn_move_data)
        val btnDialNumber: Button = findViewById(R.id.btn_dial_number)

        btnMoveActivity.setOnClickListener {
            val intent = Intent(this, MoveActivity::class.java)
            startActivity(intent)
        }

        btnMoveData.setOnClickListener {
            val intent = Intent(this, MoveWithDataActivity::class.java)
            intent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Fiki Alamsyah")
            intent.putExtra(MoveWithDataActivity.EXTRA_AGE, 19)
            startActivity(intent)
        }

        btnDialNumber.setOnClickListener {
            val phoneNumber = "08124678421"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phoneNumber"))
            startActivity(intent)
        }
    }
}


