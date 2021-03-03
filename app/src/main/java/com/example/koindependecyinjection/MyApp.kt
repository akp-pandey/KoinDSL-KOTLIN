package com.example.koindependecyinjection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

//In this class koin will come to know about the depndency which we are going to use
class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule))
        }
    }

}