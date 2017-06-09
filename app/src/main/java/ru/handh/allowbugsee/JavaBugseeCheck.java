package ru.handh.allowbugsee;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class JavaBugseeCheck {

    public static Boolean check(Context context) {

        final Uri URI = Uri
                .parse("content://ru.handh.allowbugsee.providers");

        ContentResolver cr = context.getContentResolver();
        Cursor cursor = cr.query(URI, null, null, null, null);
        boolean result = false;
        if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
            result = cursor.getInt(0) == 1;
            cursor.close();
        }
        return result;
    }

}
