package com.example.smyapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val btnPickImage:Button = findViewById(R.id.pickImage)
//        btnPickImage.setOnClickListener {
//            Log.d(TAG,"Marwa")
//        }
//
//        btnPickImage.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                Log.d(TAG,"Marwa")
//            }
//
//        })
    }
}

/*
1-Applications Components
----------------------------
1- Activity
2- Service
3- Broadcast Receiver
4- Content Provider

------------------------------

                    View
                     |
            ViewGroup    View
            /     \
        Layout    AdapterView
 ------------------------------
 Layouts:
 1- LinearLayout  (Horizontal, Vertical)




 -----------------------------------
 1- findViewById
 */