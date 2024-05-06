package com.ha.freelancerprojecttracker.service;

import com.ha.freelancerprojecttracker.model.Task;
import com.ha.freelancerprojecttracker.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TaskService {

    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

}
