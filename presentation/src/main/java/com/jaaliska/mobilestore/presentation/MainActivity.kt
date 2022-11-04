package com.jaaliska.mobilestore.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaaliska.mobilestore.presentation.ui.mainscreen.MainScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainScreen.newInstance())
                .commitNow()
        }
    }
}