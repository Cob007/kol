package android.michealcob.kol.coordinator

import android.michealcob.kol.R
import android.michealcob.kol.views.login.LoginFragment
import android.michealcob.kol.views.register.RegisterFragment
import android.michealcob.kol.views.splash.SplashFragment
import android.support.v4.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.view.*

class Navigator{

    var activty : FragmentActivity? = null

    fun showSplashScreen(){
        activty!!.supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, SplashFragment())
            .commit()
    }

    fun showLogin(){
        activty!!.supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, LoginFragment())
            .commit()
    }

    fun showRegister(){
        activty!!.supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, RegisterFragment())
            .commit()
    }


    fun showForgotPassword() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /****************************
     * here we declare all our
     * activity/fragment
     * intent/transaction and
     * they will be call by
     * respective Activity/
     * fragment coordinator
     ****************************/



}