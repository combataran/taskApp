package com.github.combataran.gotodo.ui.signup

interface SignupPresenter {
    fun signup(username: String, password: String)
    fun onSuccess()
    fun onError(code: Int, error: String)
}