package com.ha.freelancerprojecttracker.repository;

import com.ha.freelancerprojecttracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
