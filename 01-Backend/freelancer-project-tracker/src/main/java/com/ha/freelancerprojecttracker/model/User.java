package com.ha.freelancerprojecttracker.model;

import jakarta.persistence.*;

import java.util.List;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @OneToMany(mappedBy = "assignedUser", cascade = CascadeType.ALL)
    private List<Task> assignedTasks;

    private String username;
    private String email;
    private String password;
}
