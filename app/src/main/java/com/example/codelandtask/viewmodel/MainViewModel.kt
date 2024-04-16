package com.example.codelandtask.viewmodel

import androidx.lifecycle.ViewModel
import com.example.codelandtask.utils.SharedPreferencesUtil
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val sharedPreferencesUtil: SharedPreferencesUtil
):ViewModel() {
    fun isUserLoggedIn(): Boolean {
      return  sharedPreferencesUtil.isLoggedIn()
    }

    fun setLoginStatus(status:Boolean){
        sharedPreferencesUtil.setLoggedInStatus(status)
    }
}