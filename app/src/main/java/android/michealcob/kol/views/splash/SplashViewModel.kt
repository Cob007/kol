package android.michealcob.kol.views.splash

import android.arch.lifecycle.ViewModel

class SplashViewModel  (
    private var onWelcomeClicked : (() -> Unit)
): ViewModel()
{
    fun welcome(){
        onWelcomeClicked!!()
    }
}