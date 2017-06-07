
import android.app.Application
import android.net.Uri


fun Application.bugseeEnabled(): Boolean {
    var bugseeEnabled = false
    val cr = contentResolver
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