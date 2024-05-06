package com.ha.freelancerprojecttracker.service;

import com.ha.freelancerprojecttracker.model.Project;
import com.ha.freelancerprojecttracker.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
