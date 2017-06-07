
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class JavaBugSeeCheck {

    public static Boolean check(Context context) {
        boolean bugseeEnabled = false;
        ContentResolver cr = context.getContentResolver();
        Cursor cursor = cr.query(Uri.parse("content://ru.handh.abs.allowed"), null, null, null, null);
        if (cursor != null) {
            int index = cursor.getColumnIndex("bugsee");
            if (index != -1) {
                cursor.moveToFirst();
                bugseeEnabled = Boolean.parseBoolean(cursor.getString(index));
            }
            cursor.close();
        }
        return bugseeEnabled;
    }

}
