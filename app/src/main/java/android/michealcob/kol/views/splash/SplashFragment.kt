package android.michealcob.kol.views.splash


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.michealcob.kol.R
import android.michealcob.kol.utils.getViewModel
import android.os.Handler
import kotlinx.android.synthetic.main.fragment_splash.*


class SplashFragment : Fragment() {

    private val SPLASH_TIME_OUT:Long=3000

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, null, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val vm : SplashViewModel = getViewModel()

        Handler().postDelayed({
            vm.welcome()
        }, SPLASH_TIME_OUT)

        /*welcome.setOnClickListener {
            vm.welcome()
        }*/
    }


}
