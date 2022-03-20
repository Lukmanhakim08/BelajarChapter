package lu.andlim.belajarchapter3.MiniChalange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen2.*
import lu.andlim.belajarchapter3.R
import lu.andlim.belajarchapter3.keempat.HalamanduaActivity

class Screen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        btnSceentiga.setOnClickListener {
            val pindah = Intent(this, Screen3Activity::class.java)
            pindah.putExtra("namasaya", edtsaya.text.toString())
            startActivity(pindah)
        }
    }
}