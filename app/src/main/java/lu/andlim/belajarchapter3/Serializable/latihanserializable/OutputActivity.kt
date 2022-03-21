package lu.andlim.belajarchapter3.Serializable.latihanserializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*
import lu.andlim.belajarchapter3.R

class OutputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val ambildata = intent.getSerializableExtra("PRIBADI") as dataPribadi
        val umur = ambildata.umur
        val keterangan = if (umur % 2 == 0){
            "Genap"
        } else{
            "Ganjil"
        }

        t_nama.setText("Nama : ${ambildata.nama}")
        t_umur.setText("Umur : ${ambildata.umur}, $keterangan")
        t_alamat.setText("Alama : ${ambildata.alamat}")
        t_hobi.setText("Hobi: ${ambildata.hobi}")

    }
}