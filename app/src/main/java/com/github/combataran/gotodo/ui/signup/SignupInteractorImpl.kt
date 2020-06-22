package com.github.combataran.gotodo.ui.signup

import android.annotation.SuppressLint
import com.github.combataran.gotodo.repository.Repository
import com.github.combataran.gotodo.util.ApiError

class SignupInteractorImpl(val presenter: SignupPresenter) : SignupInteractor {
    @SuppressLint("CheckResult")
    override fun signup(username: String, password: String) {
        Repository.register(username, password)
            .subscribe({ presenter.onSuccess() },
                { error ->
                    val httpError = ApiError(error)
                    presenter.onError(httpError.code, httpError.message)
                })
    }
}