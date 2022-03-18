package lu.andlim.belajarchapter3.MiniChalange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen1.*
import lu.andlim.belajarchapter3.LatihanKetiga
import lu.andlim.belajarchapter3.R

class Screen1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        btngoscreendua.setOnClickListener {
            val intent = Intent(this, Screen2Activity::class.java)
            startActivity(intent)
        }
    }
}