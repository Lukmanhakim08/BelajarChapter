package lu.andlim.belajarchapter3.wisatan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view.*
import lu.andlim.belajarchapter3.R

class WebWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_wisata)

        web.loadUrl("https://dagodreampark.co.id/?gclid=CjwKCAjwlcaRBhBYEiwAK341jfSR-ELnFMhfCMEah0OyGPqEYU7lV778g41Hgn_LLDk-9WZrpbOd6hoCXJ8QAvD_BwE")
    }
}