package allowbugsee.handh.ru.allowbugsee

import android.content.Context
import android.net.Uri

fun KotlinBugSeeCheck(context: Context):Boolean {
    val selectionArgs = arrayOf("bugsee")
    val cursor = context.contentResolver.query(Uri.parse("content://ru.handh.abs.allowed"), null, null, selectionArgs, null)
    val bugSeeEnable: Boolean = generateSequence { if (cursor.moveToNext()) cursor else null }
            .filter { cursor -> cursor.getString(0) == "bugsee" }
            .count() >= 1
    return bugSeeEnable
}