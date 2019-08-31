package android.michealcob.kol.coordinator

class LoginFlowCoordinator(
    private val navigator: Navigator
) {

    fun register(){
        navigator.showRegister()
    }

    fun forgotPassword(){
        navigator.showForgotPassword()
    }
}