package allowbugsee.handh.ru.allowbugsee

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var toggleButton: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.toggleButtonBugSee) as ToggleButton

        toggleButton.setOnClickListener {
            DataManager().writeData(this, "bugsee", toggleButton.isChecked)
            update()
        }
        update()

    }

    fun update() {

        // Kotlin check example
        // val bugSeeEnable = KotlinBugseeCheck(this)
        // Java check example
        val bugSeeEnable = JavaBugseeCheck.check(this)

        toggleButton.isChecked = bugSeeEnable
    }

}
