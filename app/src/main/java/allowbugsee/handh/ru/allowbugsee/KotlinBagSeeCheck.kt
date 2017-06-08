package allowbugsee.handh.ru.allowbugsee

import android.content.Context
import android.net.Uri

fun KotlinBugseeCheck(context: Context):Boolean {
    val selectionArgs = arrayOf("bugsee")
    val cursor = context.contentResolver.query(Uri.parse("content://allowbugsee.handh.ru.allowbugsee"), null, null, selectionArgs, null)
    if (cursor == null) return false
    val bugSeeEnable: Boolean = generateSequence { if (cursor.moveToNext()) cursor else null }
            .filter { cursor -> cursor.getString(0) == "bugsee" }
            .count() >= 1
    cursor.close()
    return bugSeeEnable
}