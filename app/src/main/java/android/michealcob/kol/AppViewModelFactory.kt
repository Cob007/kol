package android.michealcob.kol

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.michealcob.kol.coordinator.Navigator
import android.michealcob.kol.coordinator.RootFlowCoordinator
import android.michealcob.kol.coordinator.SplashFlowCoordinator
import android.michealcob.kol.views.splash.SplashViewModel

class AppViewModelFactory(application : Application) : ViewModelProvider.Factory {

    val navigator = Navigator()

    lateinit var rootFlowCoordinator : RootFlowCoordinator

    private val splashCoordinator = SplashFlowCoordinator(
        navigator = navigator
    )

    init {
        rootFlowCoordinator.splashFlowCoordinator = splashCoordinator
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        when(modelClass){
            SplashViewModel::class.java -> SplashViewModel(
                onWelcomeClicked = splashCoordinator::start
            )

        else -> throw IllegalArgumentException("No ViewModel registered for $modelClass")
    } as T
}