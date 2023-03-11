package mamanyosquad.vidiaries

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val i = Intent(
                this@MainActivity,
                HomeScreen::class.java
            )
            startActivity(i)
            finish()
        }, 4500)
    }

}