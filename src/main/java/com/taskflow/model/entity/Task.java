package com.taskflow.model.entity;

import com.taskflow.model.enums.TaskPriority;
import com.taskflow.model.enums.TaskStatus;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "TASK")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @SequenceGenerator(name = "taskSeqGen", sequenceName = "TASK_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskSeqGen")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Column(name = "PRIORITY")
    @Enumerated(EnumType.STRING)
    private TaskPriority priority;

    @ManyToOne
    @JoinColumn(name = "ID_PROJECT", nullable = false)
    private Project project;
}
