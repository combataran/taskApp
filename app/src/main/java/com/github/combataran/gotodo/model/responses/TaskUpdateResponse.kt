package com.github.combataran.gotodo.model.responses

import com.github.combataran.gotodo.model.Task

data class TaskUpdateResponse (
    val message: String,
    val task: Task
)