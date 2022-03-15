package lu.andlim.belajarchapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lyfe.*

class ActivityLyfe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lyfe)

        textlifecyle.text = "\n onCreate"

    }

    override fun onStart() {
        super.onStart()
        textlifecyle.append("\n onStart")
    }

    override fun onResume() {
        super.onResume()
        textlifecyle.append("\n onResume")
    }

    override fun onPause() {
        super.onPause()
        textlifecyle.append("\n onPause")
    }

    override fun onStop() {
        super.onStop()
        textlifecyle.append("\n onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        textlifecyle.append("\n onDestroy")
    }
}