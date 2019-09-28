package com.arildojr.sicredievents

import android.app.Application
import com.arildojr.data.di.getEventModules
import com.arildojr.sicredievents.eventdetail.di.getEventDetailModules
import com.arildojr.sicredievents.main.di.getMainModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(getEventModules() + getMainModules() + getEventDetailModules())
        }
    }
}