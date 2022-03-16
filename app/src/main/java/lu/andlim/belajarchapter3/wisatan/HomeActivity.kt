package lu.andlim.belajarchapter3.wisatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*
import lu.andlim.belajarchapter3.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnhome.setOnClickListener {
            val home = Intent (this, DashhomeActivity::class.java)
            startActivity(home)
        }

        btnweb.setOnClickListener {
            startActivity(Intent(this, WebWisataActivity::class.java))
        }

        btnprofile.setOnClickListener {
            val profil = Intent (this, ProfileActivity::class.java)
            startActivity(profil)
        }

        btnlogout.setOnClickListener {
            val logout = Intent (this, LoginActivity::class.java)
            startActivity(logout)
        }

    }
}