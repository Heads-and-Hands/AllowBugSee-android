
import android.app.Application;
import com.bugsee.library.Bugsee;

public class SampleJavaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (JavaBugSeeCheck.check(this)) {
            Bugsee.launch(this, "BUGSEE_KEY");
        }
    }
}