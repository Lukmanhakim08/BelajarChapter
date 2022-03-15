package lu.andlim.belajarchapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kalkulator.*
import kotlinx.android.synthetic.main.activity_kalkulator.texthasil
import kotlinx.android.synthetic.main.activity_latihan_ketiga.*
import kotlinx.android.synthetic.main.activity_latihan_satu.*
import kotlinx.android.synthetic.main.activity_main.*

class LatihanKetiga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_ketiga)

        btntransaksi.setOnClickListener {
            val nama = edtnama.text.toString()
            val judul = edtjudul.text.toString()
            val jumlah = edtbanyak.text.toString()
            val harga = edtharga.text.toString()
            val  bayar = edtbayar.text.toString()
            val total = jumlah.toInt() * harga.toInt()
            val kembali = bayar.toInt() - total

            texttotal.text = "Total Jumlah : $total"
            textkembali.text = "Uang Kelmbali : $kembali"

            if (total.toString().toInt() > 60000 ){
                textbonus.setText("Bonus : keyboard")
            } else{
                textbonus.setText( "Keterangan : Tidak ada Bonus")
            }

            if (kembali.toString().toInt() > 0){
                textketerang.setText("Keterangan : Tunggu kembalian")
            } else{
                textketerang.setText( "Keterangan : Tidak ada kembalian")
            }

        }

        btnResetdata.setOnClickListener {
            edtnama.setText(null)
            edtjudul.setText(null)
            edtbanyak.setText(null)
            edtharga.setText(null)
            edtbayar.setText(null)
            texttotal.setText(null)
            textkembali.setText(null)
            textbonus.setText(null)
            textketerang.setText(null)
        }

        btnkeluar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}