package com.rogerb.mapas_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val OpenDubMap: Button=findViewById(R.id.Dublinbtn)

        OpenDubMap.setOnClickListener{
            val intent=Intent(applicationContext,DublinMap::class.java)
            startActivity(intent)
        }

        val OpenLyonMap: Button=findViewById(R.id.Lyonbtn)

        OpenLyonMap.setOnClickListener{
            val intent=Intent(applicationContext,LyonMap::class.java)
            startActivity(intent)
        }

    }
}