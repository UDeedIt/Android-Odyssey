package pro.udeedit.academy.androidodyssey

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

/**
 * Launcher activity that integrates with the system splash screen.
 *
 * For now it immediately forwards to [MainActivity].
 */
class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Install the system-controlled splash screen (Android 12+)
        installSplashScreen()

        super.onCreate(savedInstanceState)

        // TODO: later we can keep this activity alive to show our own splash UI.
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
