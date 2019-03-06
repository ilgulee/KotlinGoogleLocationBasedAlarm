package ilgulee.com.kotlingooglelocationbasedalarm

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    fun onClickButton(view: View) {
        Toast.makeText(this, "Alarm Set", Toast.LENGTH_LONG).show()
    }
}
