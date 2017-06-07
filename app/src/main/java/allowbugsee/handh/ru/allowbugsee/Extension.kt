package allowbugsee.handh.ru.allowbugsee

import android.app.Application
import android.net.Uri


fun Application.bugseeEnabled(): Boolean {
    val cr = contentResolver
    val selectionArgs = arrayOf("bugsee")
    val c = cr.query(Uri.parse("content://ru.handh.abs.allowed"), null, null, selectionArgs, null) ?: return false
    val enabled = c.count > 0
    c.close()
    return enabled
}
