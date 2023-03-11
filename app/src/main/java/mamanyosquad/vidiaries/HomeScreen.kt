package mamanyosquad.vidiaries

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)

        val viMainStory: FloatingActionButton = findViewById(R.id.btnMainStory)
        viMainStory.setOnClickListener {
            val vi = Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly./VIDiariesRealTime"))
            startActivity(vi)
        }

        val btnMITLicense: Button = findViewById(R.id.btnMITLicense)
        btnMITLicense.setOnClickListener {
            val mit = Intent(this@HomeScreen, MITLicense::class.java)
            startActivity(mit)
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