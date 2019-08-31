package android.michealcob.kol.views.login

import android.arch.lifecycle.ViewModel

class LoginViewModel (
    private var onLogin :(() -> Unit),
    private var onForgotPassword : (() -> Unit),
    private var onRegister : (() -> Unit)
): ViewModel() {

    fun login(){
        onLogin!!()
    }

    fun forgotPassword(){
        onForgotPassword!!()
    }

    fun register(){
        onRegister!!()
    }
}