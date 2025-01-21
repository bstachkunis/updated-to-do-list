package com.example.todolist.service;

import com.example.todolist.model.Task;
import com.example.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// TaskService - Fetches data from the database

@Service // Spring service declaration, availble now for dependency injection
public class TaskService {
    private final TaskRepository taskRepository; // final allows to be assigned once, helps with overwriting/reassignment

    // Assign instance of TaskRepository
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    // Return a list of all the tasks within the database
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Create and save a new task within the database
    public Task createTask(Task task){
        return taskRepository.save(task);
    }
    
}
