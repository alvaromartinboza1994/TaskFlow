package com.taskflow.model.enums;

/**
 * Represents the current state of a task in the system.
 * <p>
 * Each status reflects a step in the task lifecycle.
 */
public enum TaskStatus {
    /** Task has not started yet. */
    PENDING,

    /** Task is currently being worked on. */
    IN_PROGRESS,

    /** Task has been completed successfully. */
    COMPLETED
}
