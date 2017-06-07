package allowbugsee.handh.ru.allowbugsee

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.SwitchCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textViewBugseeStatus: TextView
    lateinit var switchBugsee: SwitchCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewBugseeStatus = findViewById(R.id.textViewBugseeStatus) as TextView
        switchBugsee = findViewById(R.id.switchBugseeEnabled) as SwitchCompat

        switchBugsee.isChecked = prefs.bugseeEnabled
        handleBugseeStatus(prefs.bugseeEnabled)
        switchBugsee.setOnCheckedChangeListener { _, isChecked -> handleBugseeStatus(isChecked) }
    }

    private fun handleBugseeStatus(enabled: Boolean) {
        if (enabled) {
            textViewBugseeStatus.text = "BugSee allowed"
            textViewBugseeStatus.setTextColor(ContextCompat.getColor(this, R.color.green))
            prefs.bugseeEnabled = true
        } else {
            textViewBugseeStatus.text = "BugSee NOT allowed"
            textViewBugseeStatus.setTextColor(ContextCompat.getColor(this, R.color.red))
            prefs.bugseeEnabled = false
        }
    }


}
