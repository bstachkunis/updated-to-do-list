package com.example.todolist.controller;

import com.example.todolist.model.Task;
import com.example.todolist.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TaskController - Handles HTTP requests and responses (Endpoints)

@RestController // Controller for REST API
@RequestMapping("/tasks") // Base URL for all endpoints
public class TaskController {
    // Use and initialize instance of TaskService class for database
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    // Redirect root URL to /tasks
    @GetMapping("/")
    public String redirectToTasks() {
        return "redirect:/tasks";
    }

    @GetMapping // Get endpoint
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping // Post endpoint
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }
}
