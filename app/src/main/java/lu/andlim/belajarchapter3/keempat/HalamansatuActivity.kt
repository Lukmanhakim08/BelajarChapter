package lu.andlim.belajarchapter3.keempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halamansatu.*
import lu.andlim.belajarchapter3.R

class HalamansatuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamansatu)

        btnprosessatu.setOnClickListener {
            val uts = edtnis.text.toString().toInt()
            val uas = edtuas.text.toString().toInt()
            val tugas = edttugas.text.toString().toInt()
            val namamhs = edtnamamhs.text.toString()
            val grade : String
            val total : Int
            val keterangan : String

            total = (uts + uas + tugas)/3

            if (total >= 90){
                grade = "A"
            } else if (total >= 70){
                grade = "B"
            } else if (total >= 60){
                grade = "C"
            } else if (total >= 50){
                grade = "D"
            } else{
                grade = "E"
            }

            if (total >= 65){
                keterangan = "LULUS"
            } else{
                keterangan = "TIDAK LULUS"
            }

            val pindah = Intent(this,HalamanduaActivity::class.java)
            pindah.putExtra("namamhs", namamhs)
            pindah.putExtra("total", total.toString())
            pindah.putExtra("grade", grade)
            pindah.putExtra("keterangan", keterangan)
            startActivity(pindah)
        }

        // Bundle

        btnprosesbundle.setOnClickListener {
            val uts = edtnis.text.toString().toInt()
            val uas = edtuas.text.toString().toInt()
            val tugas = edttugas.text.toString().toInt()
            val namamhs = edtnamamhs.text.toString()
            val grade : String
            val total : Int
            val keterangan : String

            total = (uts + uas + tugas)/3

            if (total >= 90){
                grade = "A"
            } else if (total >= 70){
                grade = "B"
            } else if (total >= 60){
                grade = "C"
            } else if (total >= 50){
                grade = "D"
            } else{
                grade = "E"
            }

            if (total >= 65){
                keterangan = "LULUS"
            } else{
                keterangan = "TIDAK LULUS"
            }

            val pindah = Intent(this,HalamanduaActivity::class.java)
            val bund = Bundle()
            bund.putString("namahs", namamhs.toString())
            bund.putString("total", total.toString())
            bund.putString("grade", grade)
            bund.putString("keterangan", keterangan)
            pindah.putExtras(bund)
            startActivity(pindah)
        }


    }
}