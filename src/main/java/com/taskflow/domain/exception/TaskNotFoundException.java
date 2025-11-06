package com.taskflow.domain.exception;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long taskId) {
    }
}
