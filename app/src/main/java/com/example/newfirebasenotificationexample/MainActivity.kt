package com.example.newfirebasenotificationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //이상하게 작동이 안된다.. 아니네.. 약간 늦게 보내지네.. 그래도 받았으니깐..
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}