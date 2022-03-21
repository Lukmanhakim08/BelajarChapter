package lu.andlim.belajarchapter3.Serializable.latihankedua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_to.*
import lu.andlim.belajarchapter3.R

class ToActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to)

        val persegipanjang = intent.getParcelableExtra<dataLuas>("HASIL") as dataLuas
        val luas = persegipanjang.panjang * persegipanjang.lebar

        text_nilai.append("Luas : $luas")
    }
}