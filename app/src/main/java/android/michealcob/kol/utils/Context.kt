package android.michealcob.kol.utils

import android.app.Activity
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.michealcob.kol.MyApp
import android.michealcob.kol.coordinator.Navigator
import android.support.v4.app.Fragment

val Fragment.application
    get() = requireActivity().application as MyApp

val Activity.navigator: Navigator
    get() = (application as MyApp).viewModelFactory.navigator

inline fun <reified VM : ViewModel> Fragment.getViewModel(): VM {
    return ViewModelProviders.of(this, application.viewModelFactory!!)[VM::class.java]
}