package mamanyosquad.vidiaries

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class IS_20211031 : AppCompatActivity() {

    private lateinit var viweb: WebView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.viweb)

        viweb = findViewById(R.id.viWeb)
        viweb.webViewClient = WebViewClient()

        viweb.loadUrl("https://mamanyosquad.github.io/publishing/insidestory/20211031.html")
        viweb.settings.javaScriptEnabled = true
        viweb.clearCache(true)
    }

    override fun onBackPressed() {
        if (viweb.canGoBack())
            viweb.goBack()
        else
            super.onBackPressed()
    }

}