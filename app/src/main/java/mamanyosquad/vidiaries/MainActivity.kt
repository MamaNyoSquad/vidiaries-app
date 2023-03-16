package mamanyosquad.vidiaries

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val viMainStory: FloatingActionButton = findViewById(R.id.btnMainStory)
        viMainStory.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly./VIDiariesRealTime")))
        }

        val btnMITLicense: Button = findViewById(R.id.btnMITLicense)
        btnMITLicense.setOnClickListener {
            startActivity(Intent(this@MainActivity, MITLicense::class.java))
        }

        fun notImplemented() {
            Toast.makeText(applicationContext, "Not implemented yet", Toast.LENGTH_SHORT).show()
        }

        val btnInsideStory1: Button = findViewById(R.id.btnInsideStory1)
        btnInsideStory1.setOnClickListener {
            notImplemented()
        }
        val btnInsideStory2: Button = findViewById(R.id.btnInsideStory2)
        btnInsideStory2.setOnClickListener {
            notImplemented()
        }
        val btnInsideStory3: Button = findViewById(R.id.btnInsideStory3)
        btnInsideStory3.setOnClickListener {
            notImplemented()
        }
        val btnInsideStory4: Button = findViewById(R.id.btnInsideStory4)
        btnInsideStory4.setOnClickListener {
            notImplemented()
        }
        val btnInsideStory5: Button = findViewById(R.id.btnInsideStory5)
        btnInsideStory5.setOnClickListener {
            notImplemented()
        }
        val btnInsideStory6: Button = findViewById(R.id.btnInsideStory6)
        btnInsideStory6.setOnClickListener {
            notImplemented()
        }
    }

}