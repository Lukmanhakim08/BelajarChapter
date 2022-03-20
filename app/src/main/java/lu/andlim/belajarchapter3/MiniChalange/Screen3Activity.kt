package lu.andlim.belajarchapter3.MiniChalange

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halamandua.*
import kotlinx.android.synthetic.main.activity_screen3.*
import lu.andlim.belajarchapter3.R

class Screen3Activity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        val namasaya = intent.getStringExtra("namasaya")
        textnamasaya.text = namasaya
        textUmur.setText(intent.getStringExtra("keterangan"))
        textalamat.setText(intent.getStringExtra("imputan_alamat"))
        textpekerjaan.setText(intent.getStringExtra("imputan_pekerjaan"))

        btnscreen4.setOnClickListener {
            val intent = Intent(this, Screen4Activity::class.java)
            intent.putExtra("namasaya", namasaya)
            startActivity(intent)
        }
    }
}