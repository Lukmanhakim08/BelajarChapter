package lu.andlim.belajarchapter3.MiniChalange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen2.*
import kotlinx.android.synthetic.main.activity_screen4.*
import lu.andlim.belajarchapter3.R

class Screen4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        btnback.setOnClickListener {
            val usia = edtusia.text.toString().toInt()
            val alamat = edtalamat.text.toString()
            val pekerjaan = edtpekerjaan.text.toString()

            if (usia % 2 == 0){
                "Bernilai genap"
            } else{
                "Bernilai Ganjil"
            }

            val back = Intent(this, Screen3Activity::class.java)
            back.putExtra("umur", usia.toString().toInt())
            back.putExtra("alamat", alamat)
            back.putExtra("pekerjaan", pekerjaan)
            startActivity(back)
        }
    }
}