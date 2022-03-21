package lu.andlim.belajarchapter3.Serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kedua.*
import lu.andlim.belajarchapter3.R

class KeduaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

//        val dataperson = intent.getSerializableExtra("ANSATU") as Person
//        textserializable.text = dataperson.toString()
//        textbagian.text = dataperson.name

        //get data parcelable
        val dataparcelable = intent.getParcelableExtra("ANDUA") as PersoParsilable?
        textparcelable.text = dataparcelable.toString()
    }
}