package allowbugsee.handh.ru.allowbugsee

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Kotlin check example
        //val bugSeeEnable = KotlinBugSeeCheck(this)
        // Java check example
        val bugSeeEnable = JavaBugSeeCheck.check(this);

        val txtProviderResult: TextView = findViewById(R.id.txtProviderResult) as TextView
        if (bugSeeEnable) {
            txtProviderResult.setText("BugSee allowed")
        } else {
            txtProviderResult.setText("BugSee NOT allowed")
        }


    }

}
