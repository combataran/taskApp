package com.github.combataran.gotodo.model.responses

data class LoginTokenResponse(
    val expire: String,
    val token: String
)