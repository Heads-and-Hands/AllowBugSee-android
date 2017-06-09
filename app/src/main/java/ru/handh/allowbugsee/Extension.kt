package ru.handh.allowbugsee

import android.app.Application
import android.net.Uri


//fun Application.bugseeEnabled(): Boolean {
//    val cr = contentResolver
//    val selectionArgs = arrayOf("bugsee")
//    var enabled = false
//    val c = cr.query(Uri.parse("content://allowbugsee.handh.ru.allowbugsee"), null, null, selectionArgs, null) ?: return false
//    c.use {
//        enabled = it.count > 0
//    }
//    return enabled
//}