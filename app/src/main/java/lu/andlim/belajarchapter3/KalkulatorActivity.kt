package lu.andlim.belajarchapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kalkulator.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.texthasil

class KalkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        btntambah.setOnClickListener {
            val angka1 = edtangka_satu.text.toString()
            val angka2 = edtangka_dua.text.toString()
            val hasil = angka1.toInt() + angka2.toInt()

            texthasil.text = "$hasil"
        }

        btnkurang.setOnClickListener {
            val angka1 = edtangka_satu.text.toString()
            val angka2 = edtangka_dua.text.toString()
            val hasil = angka1.toInt() - angka2.toInt()

            texthasil.text = "$hasil"
        }

        btnkali.setOnClickListener {
            val angka1 = edtangka_satu.text.toString()
            val angka2 = edtangka_dua.text.toString()
            val hasil = angka1.toInt() * angka2.toInt()

            texthasil.text = "$hasil"
        }

        btnbagi.setOnClickListener {
            val angka1 = edtangka_satu.text.toString()
            val angka2 = edtangka_dua.text.toString()
            val hasil = angka1.toInt() / angka2.toInt()

            texthasil.text = "$hasil"
        }

        btnreset.setOnClickListener {
            edtangka_satu.setText(null)
            edtangka_dua.setText(null)
            texthasil.setText(null)
        }
    }
}