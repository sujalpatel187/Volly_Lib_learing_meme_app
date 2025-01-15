package com.example.volly_test

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    val url:String="https://meme-api.com/gimme"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        getMemeData()

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            getMemeData()
        }
    }
    fun getMemeData() {


        val queue = Volley.newRequestQueue(this)

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->

                var ressponseObj = JSONObject(response)
                val img = findViewById<ImageView>(R.id.img)

              Glide.with(this).load(ressponseObj.get("url")).into(img);

            },
            {
                error ->
                Toast.makeText(this@MainActivity, "${error.localizedMessage}", Toast.LENGTH_SHORT).show()
            })

        queue.add(stringRequest)



    }
}