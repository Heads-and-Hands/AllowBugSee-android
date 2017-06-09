package ru.handh.allowbugsee

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
            if (toggleButton.isChecked) {
                DataManager().allow(this)
            } else {
                DataManager().disallow(this)
            }
            //update()
        }

        update()

    }

    fun update() {
        val bugSeeEnable = DataManager().isAllowed(this)
        toggleButton.isChecked = bugSeeEnable
    }

}
