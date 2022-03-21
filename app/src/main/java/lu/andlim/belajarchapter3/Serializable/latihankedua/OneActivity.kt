package lu.andlim.belajarchapter3.Serializable.latihankedua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*
import kotlinx.android.synthetic.main.activity_pertama.*
import kotlinx.android.synthetic.main.activity_screen4.*
import lu.andlim.belajarchapter3.MiniChalange.Screen3Activity
import lu.andlim.belajarchapter3.R
import lu.andlim.belajarchapter3.Serializable.KeduaActivity
import lu.andlim.belajarchapter3.Serializable.PersoParsilable

class OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        parsingnilai()
    }


    fun parsingnilai(){
        btn_nilai.setOnClickListener {
            val panjang = edt_panjang.text.toString().toInt()
            val lebar = edt_lebar.text.toString().toInt()
            val parsing = Intent(this, ToActivity::class.java)
            val dataluas = dataLuas(panjang, lebar)
            parsing.putExtra("HASIL", dataluas)
            startActivity(parsing)
        }
    }
}