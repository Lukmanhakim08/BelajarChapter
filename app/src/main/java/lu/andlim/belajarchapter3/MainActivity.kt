package lu.andlim.belajarchapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

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
    }


}