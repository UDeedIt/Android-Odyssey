package pro.udeedit.academy.androidodyssey

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Immediately navigate to the main host activity and close splash.
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}