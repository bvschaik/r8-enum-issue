package com.github.bvschaik.r8enumissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.bvschaik.r8enumlib.LibObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LibObject().print()
    }
}