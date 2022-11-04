package com.jaaliska.mobilestore

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DefaultApplicationApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {

            androidContext(this@DefaultApplicationApp)
            //modules(app)
        }
    }
}