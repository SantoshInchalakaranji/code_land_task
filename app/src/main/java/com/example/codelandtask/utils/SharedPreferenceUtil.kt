package com.example.codelandtask.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesUtil(
   private val context: Context
) {
    companion object{
        private  val PREF_NAME = "MyPreferences"
        private  val KEY_IS_LOGGED_IN = "isLoggedIn"
    }


    fun setLoggedInStatus( isLoggedIn: Boolean) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean(KEY_IS_LOGGED_IN, isLoggedIn)
        editor.apply()
    }

    fun isLoggedIn(): Boolean {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean(KEY_IS_LOGGED_IN, false)
    }
}
