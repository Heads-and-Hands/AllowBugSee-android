package allowbugsee.handh.ru.allowbugsee

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.database.MatrixCursor
import android.net.Uri

class ABSContentProvider : ContentProvider() {


    override fun getType(p0: Uri?): String = ""

    override fun delete(p0: Uri?, p1: String?, p2: Array<out String>?): Int = 0

    override fun update(p0: Uri?, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int = 0

    override fun onCreate(): Boolean = true

    override fun query(p0: Uri?, p1: Array<out String>?, p2: String?, p3: Array<out String>?, p4: String?): Cursor {
        val columns = arrayOf("bugsee")
        val cursor: MatrixCursor = MatrixCursor(columns)
        cursor.addRow(arrayOf(prefs.bugseeEnabled))
        return cursor
    }

    override fun insert(p0: Uri?, p1: ContentValues?): Uri? = null

}