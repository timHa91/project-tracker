package com.ha.freelancerprojecttracker.model;

import jakarta.persistence.*;

import java.time.LocalDate;

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private String comments;

    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User assignedUser;

}
