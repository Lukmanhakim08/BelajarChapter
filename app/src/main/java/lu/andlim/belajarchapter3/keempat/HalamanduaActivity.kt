package lu.andlim.belajarchapter3.keempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halamandua.*
import lu.andlim.belajarchapter3.R

class HalamanduaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamandua)

        textnamamhs.setText(intent.getStringExtra("namamhs"))
        textnilai.setText(intent.getStringExtra("total"))
        textgrade.setText(intent.getStringExtra("grade"))
        textket.setText(intent.getStringExtra("keterangan"))


        // Bundle
        val bund = intent.extras
        textnamamhs.setText(bund?.getString("namahs"))
        textnilai.setText(bund?.getString("total"))
        textgrade.setText(bund?.getString("grade"))
        textket.setText(bund?.getString("keterangan"))

    }
}