package pro.udeedit.academy.androidodyssey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pro.udeedit.academy.androidodyssey.di.GreetingService
import pro.udeedit.academy.androidodyssey.ui.theme.AndroidOdysseyTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var greetingService: GreetingService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Trigger Dagger injection so that all @Inject fields are initialized
        (application as AndroidOdysseyApp).appComponent.inject(this)

        enableEdgeToEdge()
        setContent {
            AndroidOdysseyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    AndroidOdysseyTheme {
        Greeting2("Android")
    }
}