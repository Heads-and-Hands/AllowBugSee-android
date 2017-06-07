
import android.content.Context
import android.net.Uri

fun KotlinBugSeeCheck(context: Context):Boolean {
    var bugseeEnabled = false
    val cr = context.contentResolver
    val cursor = cr.query(Uri.parse("content://ru.handh.abs.allowed"), null, null, null, null) ?: return false
    cursor.use {
        val index = cursor.getColumnIndex("bugsee")
        if (index != -1) {
            cursor.moveToFirst()
            bugseeEnabled = cursor.getString(index).toBoolean()
        }
    }
    return bugseeEnabled
}