package lu.andlim.belajarchapter3.wisatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import lu.andlim.belajarchapter3.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnlogin.setOnClickListener {
//
            val email = edtusername.text.toString()
            val password = edtpassword.text.toString()
//
//            if (email == "admin" && password == "12345"){
//                textlogin.setText("OK")
//                startActivity(Intent(this, HomeActivity::class.java))
//            } else {
//                textlogin.setText("Login gagal")
//            }

            if (email.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(email == "4meloli@gmail.com" && password == "admin01"){
                val intent = Intent (this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this,"Password dan username salah", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
        }
    }
}