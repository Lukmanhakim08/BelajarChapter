package lu.andlim.belajarchapter3.Serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pertama.*
import lu.andlim.belajarchapter3.R
import lu.andlim.belajarchapter3.Serializable.latihankedua.OneActivity
import lu.andlim.belajarchapter3.Serializable.latihanserializable.InputActivity

class PertamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertama)

        goparsingSerializable()
        golatihan()
        golatihanparce()
        parsingParcelable()
    }

    fun goparsingSerializable(){
        btnserializable.setOnClickListener {
            val parsing = Intent(this, KeduaActivity::class.java)
            val dataprson = Person("lukman", "lukman081217@gmail.com")
            parsing.putExtra("ANSATU", dataprson)
            startActivity(parsing)
        }
    }

    fun parsingParcelable(){
        btnparcilable.setOnClickListener {
            val parsing = Intent(this, KeduaActivity::class.java)
            val dataperson = PersoParsilable("lukman", "ameloli@gmail")
            parsing.putExtra("ANDUA", dataperson)
            startActivity(parsing)
        }
    }

    fun golatihan(){
        btnlatihanserializable.setOnClickListener {
            val latihan = Intent(this, InputActivity::class.java)
            startActivity(latihan)
        }
    }

    fun golatihanparce(){
        btnlatihanparcelable.setOnClickListener {
            val latihan = Intent(this, OneActivity::class.java)
            startActivity(latihan)
        }
    }
}