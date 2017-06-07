
import android.app.Application
import com.bugsee.library.Bugsee

class SampleKotlinApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (KotlinBugSeeCheck(this)) {
            Bugsee.launch(this, "BUGSEE_KEY")
        }
        // OR
        if (bugseeEnabled()) {
            Bugsee.launch(this, "BUGSEE_KEY")
        }
    }
}