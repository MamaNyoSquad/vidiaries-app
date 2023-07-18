package mamanyosquad.vidiaries

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.concurrent.Executors


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val viMainStory: FloatingActionButton = findViewById(R.id.btnMainStory)
        viMainStory.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly/VIDiariesRealTime")))
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
            startActivity(Intent(this@MainActivity, IS_20210907::class.java))
        }
        val btnInsideStory2: Button = findViewById(R.id.btnInsideStory2)
        btnInsideStory2.setOnClickListener {
            startActivity(Intent(this@MainActivity, IS_20210920::class.java))
        }
        val btnInsideStory3: Button = findViewById(R.id.btnInsideStory3)
        btnInsideStory3.setOnClickListener {
            startActivity(Intent(this@MainActivity, IS_20211031::class.java))
        }
        val btnInsideStory4: Button = findViewById(R.id.btnInsideStory4)
        btnInsideStory4.setOnClickListener {
            startActivity(Intent(this@MainActivity, IS_20211119_1::class.java))
        }
        val btnInsideStory5: Button = findViewById(R.id.btnInsideStory5)
        btnInsideStory5.setOnClickListener {
            startActivity(Intent(this@MainActivity, IS_20211119_2::class.java))
        }
        val btnInsideStory6: Button = findViewById(R.id.btnInsideStory6)
        btnInsideStory6.setOnClickListener {
            startActivity(Intent(this@MainActivity, IS_20220130::class.java))
        }

        val insideStory1_head: ImageView = findViewById(R.id.insideStory1_head)
        val insideStory2_head: ImageView = findViewById(R.id.insideStory2_head)
        val insideStory3_head: ImageView = findViewById(R.id.insideStory3_head)
        val insideStory4_head: ImageView = findViewById(R.id.insideStory4_head)
        val insideStory5_head: ImageView = findViewById(R.id.insideStory5_head)
        val insideStory6_head: ImageView = findViewById(R.id.insideStory6_head)

        val urlHandl = Executors.newSingleThreadExecutor()
        val urlParse = Handler(Looper.getMainLooper())

        var ISHead1: Bitmap?
        var ISHead2: Bitmap?
        var ISHead3: Bitmap?
        var ISHead4: Bitmap?
        var ISHead5: Bitmap?
        var ISHead6: Bitmap?

        urlHandl.execute {
            val IS1 = "https://mamanyosquad.github.io/media/images/insidestory/01_nagisa.png"
            val IS2 = "https://mamanyosquad.github.io/media/images/insidestory/02_fiona.png"
            val IS3 = "https://mamanyosquad.github.io/media/images/insidestory/03_tsukushi.png"
            val IS4 = "https://mamanyosquad.github.io/media/images/insidestory/04_nyotengu.png"
            val IS5 = "https://mamanyosquad.github.io/media/images/insidestory/05_luna.png"
            val IS6 = "https://mamanyosquad.github.io/media/images/insidestory/06_helena.png"

            try {
                val fetchIS1 = java.net.URL(IS1).openStream()
                ISHead1 = BitmapFactory.decodeStream(fetchIS1)
                val fetchIS2 = java.net.URL(IS2).openStream()
                ISHead2 = BitmapFactory.decodeStream(fetchIS2)
                val fetchIS3 = java.net.URL(IS3).openStream()
                ISHead3 = BitmapFactory.decodeStream(fetchIS3)
                val fetchIS4 = java.net.URL(IS4).openStream()
                ISHead4 = BitmapFactory.decodeStream(fetchIS4)
                val fetchIS5 = java.net.URL(IS5).openStream()
                ISHead5 = BitmapFactory.decodeStream(fetchIS5)
                val fetchIS6 = java.net.URL(IS6).openStream()
                ISHead6 = BitmapFactory.decodeStream(fetchIS6)

                urlParse.post {
                    insideStory1_head.setImageBitmap(ISHead1)
                    insideStory2_head.setImageBitmap(ISHead2)
                    insideStory3_head.setImageBitmap(ISHead3)
                    insideStory4_head.setImageBitmap(ISHead4)
                    insideStory5_head.setImageBitmap(ISHead5)
                    insideStory6_head.setImageBitmap(ISHead6)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}