package allowbugsee.handh.ru.allowbugsee;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class JavaBugseeCheck {

    public static boolean check(Context context) {
        ContentResolver cr = context.getContentResolver();
        String[] selectionArgs = new String[]{"bugsee"};
        Cursor cursor = null;
        cursor = cr.query(Uri.parse("content://allowbugsee.handh.ru.allowbugsee"), null, null, selectionArgs, null);

        boolean result = false;
        if (cursor != null) {
            result = (cursor.getCount() > 0);
            cursor.close();
        }
        return result;

    }

}
