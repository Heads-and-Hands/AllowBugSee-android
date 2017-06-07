package allowbugsee.handh.ru.allowbugsee;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class JavaBugSeeCheck {

    public static Boolean check(Context context) {
        ContentResolver cr = context.getContentResolver();
        String[] selectionArgs = new String[]{"bugsee"};
        Cursor cursor = cr.query(Uri.parse("content://ru.handh.abs.allowed"), null, null, selectionArgs, null);
        return (cursor != null) && (cursor.getCount() > 0);
    }

}
