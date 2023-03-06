package mamanyosquad.vidiaries

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redirMainStory: Button = findViewById(R.id.btnMainStoryRedirect)
        redirMainStory.setOnClickListener {
            val vi = Intent(Intent.ACTION_VIEW, Uri.parse("https://bit.ly./VIDiariesRealTime"))
            startActivity(vi)
        }
    }

}