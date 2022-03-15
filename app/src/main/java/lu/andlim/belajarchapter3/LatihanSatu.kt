package lu.andlim.belajarchapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_latihan_satu.*

class LatihanSatu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_satu)

        btnproses.setOnClickListener {
            val text1 = edtNama.text.toString()
            val text2 = edtUmur.text.toString()

            if (edtNilai.text.toString().toInt() > 80 && edtNilai.text.toString().toInt() <=100){
                textnilai.setText("A")
            } else if (edtNilai.text.toString().toInt() > 70 && edtNilai.text.toString().toInt() <= 80){
                textnilai.setText( "B")
            } else if (edtNilai.text.toString().toInt() > 60 && edtNilai.text.toString().toInt() <= 70){
                textnilai.setText( "C")
            } else{
                textnilai.setText( "D")
            }


            if (edtNilai.text.toString().toInt() > 80 && edtNilai.text.toString().toInt() <=100){
                keterangan.setText("Lulus")
            } else if (edtNilai.text.toString().toInt() > 70 && edtNilai.text.toString().toInt() <= 80){
                keterangan.setText( "Lulus")
            } else if (edtNilai.text.toString().toInt() > 60 && edtNilai.text.toString().toInt() <= 70){
                keterangan.setText( "Tidak Lulus")
            } else{
                keterangan.setText( "Tidak Lulus")
            }

            textNama.text = "Nama : $text1"
            textUmur.text = "Umur : $text2"
        }
    }
}