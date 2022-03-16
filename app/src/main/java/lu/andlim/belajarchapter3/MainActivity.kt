package lu.andlim.belajarchapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import lu.andlim.belajarchapter3.wisatan.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val angka = 80
//        val angka2 = 89
//        val hasil = angka + angka2
//
//        txt1.text = hasil.toString()

        proses.setOnClickListener {
            val angka1 = angkesatu.text.toString()
            val angka2 = angkedua.text.toString()
            val hasil = angka1.toInt() + angka2.toInt()

            texthasil.text = "Penjumlahan $angka1 + $angka2 = $hasil"
        }

        btnWebview.setOnClickListener {
            val intent = Intent(this, WebView::class.java)
            startActivity(intent)
        }

        btnlatihan1.setOnClickListener {
            val intent = Intent(this, LatihanSatu::class.java)
            startActivity(intent)
        }

        btnkalkulator.setOnClickListener {
            val intent = Intent(this, KalkulatorActivity::class.java)
            startActivity(intent)
        }

        latihan_kedua.setOnClickListener {
            val  intent = Intent(this, ActivityLyfe::class.java)
            startActivity(intent)
        }

        latihan_ketiga.setOnClickListener {
            val intent = Intent(this, LatihanKetiga::class.java)
            startActivity(intent)
        }

        btnIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }


}