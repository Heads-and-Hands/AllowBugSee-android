package ru.handh.allowbugsee

import android.content.Context
import android.content.SharedPreferences

class DataManager {

    fun isAllowed(context: Context): Boolean {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("ru.handh.abs", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("allowed", true)
    }

    fun allow(context: Context) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("ru.handh.abs", Context.MODE_PRIVATE)
        sharedPreferences.edit().putBoolean("allowed", true).apply()
    }

    fun disallow(context: Context) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("ru.handh.abs", Context.MODE_PRIVATE)
        sharedPreferences.edit().putBoolean("allowed", false).apply()
    }

}