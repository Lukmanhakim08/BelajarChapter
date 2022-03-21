package lu.andlim.belajarchapter3.Serializable.latihanserializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input.*
import kotlinx.android.synthetic.main.activity_pertama.*
import lu.andlim.belajarchapter3.R
import lu.andlim.belajarchapter3.Serializable.KeduaActivity
import lu.andlim.belajarchapter3.Serializable.Person

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        goSerializable()
    }

    fun goSerializable(){
        btnget_data.setOnClickListener {
            val proses = Intent(this, OutputActivity::class.java)
            val data = dataPribadi("Lukman Hakim", 23, "Probolinggo", "Sepak Bola")
            proses.putExtra("PRIBADI", data)
            startActivity(proses)
        }
    }
}