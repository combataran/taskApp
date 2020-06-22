package com.github.combataran.gotodo.ui.task

interface TaskInteractor {
    fun getAllTask()
    fun createTask(title: String, description: String)
    fun updateTask(id: Int, title: String, description: String)
    fun deleteTask(id: Int)
}