package pro.udeedit.academy.androidodyssey

import android.app.Application
import pro.udeedit.academy.androidodyssey.di.AppComponent
import pro.udeedit.academy.androidodyssey.di.DaggerAppComponent

/**
 * Custom [Application] for Android Odyssey.
 *
 * Responsible for creating and holding the root Dagger [AppComponent].
 * Other Android components (activities, etc.) obtain their dependencies
 * by requesting injection from this component.
 */
class AndroidOdysseyApp : Application() {

    /**
     * Root Dagger component for application‑wide dependencies.
     */
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()

        // Build the root Dagger component. No parameters are needed yet.
        appComponent = DaggerAppComponent.create()
    }
}
