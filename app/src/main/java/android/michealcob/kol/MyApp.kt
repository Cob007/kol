package android.michealcob.kol

import android.app.Application

class MyApp : Application(){

    val viewModelFactory by lazy {
        AppViewModelFactory(this)
    }
}