package com.github.combataran.gotodo.util

import com.github.combataran.gotodo.GoTodo
import com.github.combataran.gotodo.R
import com.google.android.material.textfield.TextInputLayout

class Validator {
    var validations = mutableListOf<TextInputLayout>()

    fun add(value: TextInputLayout): Validator{
        validations.add(value)
        return this
    }
    private fun validateForNotEmpty(): Boolean {
        val check = validations.filter {
            it.editText?.text.isNullOrEmpty()
        }

        check.map {
            it.error = GoTodo.applicationContext().resources.getString(R.string.error_empty)
        }

        return check.isEmpty()
    }

    fun result(): Boolean {
        validations.map { it.error = null }
        return validateForNotEmpty()
    }

}