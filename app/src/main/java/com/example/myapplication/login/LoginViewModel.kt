package com.example.myapplication.login

import androidx.lifecycle.ViewModel

class LoginViewModel (private val repository: UserRepository) : ViewModel() { //belom ada
    fun saveSession(user: UserModel) { //belom ada
        viewModelScope.launch { //belom ada
            repository.saveSession(user)
        }
    }
}