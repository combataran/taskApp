package com.github.combataran.gotodo.ui.task

import com.github.combataran.gotodo.model.Task

interface TaskPresenter {
    fun getAllTask()
    fun createTask(title: String, description: String)
    fun editTask(id: Int, title: String, description: String)
    fun deleteTask(id: Int)
    fun onGetAllTaskSuccess(list: List<Task>)
    fun onTaskCreatedSuccess(task: Task)
    fun onTaskUpdatedSuccess(task: Task)
    fun onTaskDeletedSuccess(task: Task)
    fun onError(code: Int, message: String)
}