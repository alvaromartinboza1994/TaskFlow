package com.taskflow.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TASK")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    @SequenceGenerator(name = "projectSeqGen", sequenceName = "PROJECT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projectSeqGen")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks;

}
