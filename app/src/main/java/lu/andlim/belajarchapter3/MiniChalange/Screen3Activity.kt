package lu.andlim.belajarchapter3.MiniChalange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halamandua.*
import kotlinx.android.synthetic.main.activity_screen3.*
import lu.andlim.belajarchapter3.R

class Screen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        textnamasaya.setText(intent.getStringExtra("nama"))
        textUmur.setText(intent.getStringExtra("umur"))
        textalamat.setText(intent.getStringExtra("alamat"))
        textpekerjaan.setText(intent.getStringExtra("pekerjaan"))


        btnscreen4.setOnClickListener {


            val intent = Intent(this, Screen4Activity::class.java)
            startActivity(intent)
        }
    }
}