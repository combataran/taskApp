package com.github.combataran.gotodo.ui.task

import com.github.combataran.gotodo.model.Task

interface TaskView {
    fun getAllTask()
    fun onGetAllTaskSuccess(list: List<Task>)
    fun onError(code: Int, message: String)
    fun showProgress()
    fun hideProgress()
    fun onTaskCreatedSuccess(task: Task)
    fun onTaskUpdatedSuccess(task: Task)
    fun onTaskDeletedSuccess(task: Task)
}