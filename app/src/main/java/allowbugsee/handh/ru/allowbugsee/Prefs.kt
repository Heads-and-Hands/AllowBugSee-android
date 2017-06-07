package allowbugsee.handh.ru.allowbugsee

import android.content.Context
import android.content.SharedPreferences


class Prefs(context: Context) {
    val PREFS_FILENAME = "ru.handh.abs.preferences"
    val BUGSEE_ENABLED = "bugsee_enabled"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)

    var bugseeEnabled: Boolean
        get() = prefs.getBoolean(BUGSEE_ENABLED, false)
        set(value) = prefs.edit().putBoolean(BUGSEE_ENABLED, value).apply()
}