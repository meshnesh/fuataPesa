package com.example.fuatapesa.base

import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

open class BaseActivity : AppCompatActivity(), CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + Job()

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
        val newOverride = Configuration(newBase?.resources?.configuration)
        if (newOverride.fontScale > 1.3f) {
            newOverride.fontScale = 1.1f
            applyOverrideConfiguration(newOverride)
        }
    }
}