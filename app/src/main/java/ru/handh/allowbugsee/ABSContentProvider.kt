package ru.handh.allowbugsee

//class ABSContentProvider: ContentProvider() {
//
//    override fun getType(p0: Uri?): String = ""
//
//    override fun delete(p0: Uri?, p1: String?, p2: Array<out String>?): Int = 0
//
//    override fun update(p0: Uri?, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int = 0
//
//    override fun onCreate(): Boolean = true
//
//    override fun query(p0: Uri?, p1: Array<out String>?, p2: String?, p3: Array<out String>?, p4: String?): Cursor {
//
//        val columns = arrayOf("service")
//        val cursor: MatrixCursor = MatrixCursor(columns)
//
//        val data = DataManager().readData(context)
//
//        if (p3 != null) {
//            data.keys
//                    .filter { k -> data.get(k) as Boolean }
//                    .filter { s -> p3.contains(s) }
//                    .map { s -> cursor.addRow(arrayOf(s)) }
//        } else {
//            data.keys
//                    .filter { k -> data.get(k) as Boolean }
//                    .map { s -> cursor.addRow(arrayOf(s)) }
//        }
//
//        return cursor
//    }
//
//    override fun insert(p0: Uri?, p1: ContentValues?): Uri? = null
//
//}