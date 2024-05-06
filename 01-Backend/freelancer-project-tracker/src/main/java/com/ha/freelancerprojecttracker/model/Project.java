package com.ha.freelancerprojecttracker.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Task> tasks;
    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private ProjectStatus status;
    private LocalDate startDate;
    private LocalDate endDate;

    //Zugeteilte Benutzer (Freelancer, Kunden)
    //Fortschritt
    //Priorität
    //Tags/Kategorien
    //Dateien/Ressourcen

}
