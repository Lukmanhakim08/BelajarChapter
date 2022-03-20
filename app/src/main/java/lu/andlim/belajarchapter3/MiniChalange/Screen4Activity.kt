package lu.andlim.belajarchapter3.MiniChalange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halamansatu.*
import kotlinx.android.synthetic.main.activity_screen2.*
import kotlinx.android.synthetic.main.activity_screen4.*
import lu.andlim.belajarchapter3.R
import lu.andlim.belajarchapter3.keempat.HalamanduaActivity

class Screen4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        btnback.setOnClickListener {
            val usia = edtusia.text.toString()
            val alamat = edtalamat.text.toString()
            val pekerjaan = edtpekerjaan.text.toString()
            val namasaya = intent.getStringExtra("namasaya").toString()
            val keterangan : String
            val back = Intent(this,Screen3Activity::class.java)
            if (usia.toInt() % 2 == 0){
                keterangan = "$usia, Genap"
            }else{
                keterangan = "$usia, Ganjil"
            }
            back.putExtra("keterangan", keterangan)
            back.putExtra("imputan_alamat", alamat)
            back.putExtra("imputan_pekerjaan", pekerjaan)
            back.putExtra("namasaya", namasaya)
            startActivity(back)
        }
    }
}