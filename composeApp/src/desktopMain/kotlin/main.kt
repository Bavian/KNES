import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.bavian.knes.di.KoinInteractor
import com.bavian.knes.platform.Greeting

fun main() = application {
    val koinApplication = KoinInteractor.start()

    val greeting = koinApplication.koin.get<Greeting>()
    Window(onCloseRequest = ::exitApplication, title = "KNES") {
        App(greeting.greet)
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App("Hello, Java Preview")
}