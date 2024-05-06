package com.ha.freelancerprojecttracker.repository;

import com.ha.freelancerprojecttracker.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
