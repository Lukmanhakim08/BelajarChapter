package lu.andlim.belajarchapter3.keempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halamandua.*
import lu.andlim.belajarchapter3.R

class HalamanduaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamandua)

        val datanama = intent.getStringExtra("nama")
        textnama.text = datanama
    }
}