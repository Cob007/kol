package android.michealcob.kol.coordinator

class SplashFlowCoordinator(
    private var navigator: Navigator
){
    /*****************************************
     * here we call the intents from navigator
     *
     *****************************************/
    fun start(){
        navigator.showLogin()
    }
    /**************
     * that's all
     * cheers
     ***************/
}
