package android.michealcob.kol.coordinator

class RootFlowCoordinator {
    lateinit var splashFlowCoordinator: SplashFlowCoordinator

    init {
        splashFlowCoordinator.start()
    }
}