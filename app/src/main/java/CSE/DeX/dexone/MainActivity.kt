package CSE.DeX.dexone

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.id.imageView)
        var music:MediaPlayer

        Glide.with(this)
            .load(R.drawable.al404)
            .into(img)

        music = MediaPlayer.create(this,R.raw.this_girl)
        music?.start()
    }
}