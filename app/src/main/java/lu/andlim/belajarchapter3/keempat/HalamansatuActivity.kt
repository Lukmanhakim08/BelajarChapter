package lu.andlim.belajarchapter3.keempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halamansatu.*
import lu.andlim.belajarchapter3.R

class HalamansatuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamansatu)

        val datanama = edtnamaq.text.toString()

        val pinndah = Intent(this,HalamanduaActivity::class.java)
        pinndah.putExtra("nama", datanama)
        startActivity(pinndah)
    }
}