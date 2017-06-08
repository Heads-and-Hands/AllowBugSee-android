package allowbugsee.handh.ru.allowbugsee

import android.content.Context
import android.content.SharedPreferences

class DataManager() {

    val default_data = hashMapOf(
            "bugsee" to true
    )

    fun writeData(context: Context, service: String, value: Boolean) {
        val sp: SharedPreferences = context.getSharedPreferences("ru.handh.abs", Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.putBoolean(service, value)
        editor.commit()
    }

    fun readData(context: Context): HashMap<String, Boolean> {
        val sp: SharedPreferences = context.getSharedPreferences("ru.handh.abs", Context.MODE_PRIVATE)
        val result = default_data

        result.keys.map { key ->
            result.set(key, sp.getBoolean(key, true))
        }

        return result
    }

}