package mamanyosquad.vidiaries

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viMainStory: FloatingActionButton = findViewById(R.id.btnMainStory)
        viMainStory.setOnClickListener {
            val vi = Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly./VIDiariesRealTime"))
            startActivity(vi)
        }

        val btnMITLicense: Button = findViewById(R.id.btnMITLicense)
        btnMITLicense.setOnClickListener {
            val mit = Intent(this@MainActivity, MITLicense::class.java)
            startActivity(mit)
        }

        val btnInsideStory1: Button = findViewById(R.id.btnInsideStory1)
        btnInsideStory1.setOnClickListener {
            Toast.makeText(applicationContext, "Not implemented yet", Toast.LENGTH_SHORT).show()
        }
        val btnInsideStory2: Button = findViewById(R.id.btnInsideStory2)
        btnInsideStory2.setOnClickListener {
            Toast.makeText(applicationContext, "Not implemented yet", Toast.LENGTH_SHORT).show()
        }
        val btnInsideStory3: Button = findViewById(R.id.btnInsideStory3)
        btnInsideStory3.setOnClickListener {
            Toast.makeText(applicationContext, "Not implemented yet", Toast.LENGTH_SHORT).show()
        }
        val btnInsideStory4: Button = findViewById(R.id.btnInsideStory4)
        btnInsideStory4.setOnClickListener {
            Toast.makeText(applicationContext, "Not implemented yet", Toast.LENGTH_SHORT).show()
        }
        val btnInsideStory5: Button = findViewById(R.id.btnInsideStory5)
        btnInsideStory5.setOnClickListener {
            Toast.makeText(applicationContext, "Not implemented yet", Toast.LENGTH_SHORT).show()
        }




    }

}