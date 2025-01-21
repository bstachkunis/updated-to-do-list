package com.example.todolist.repository;

import com.example.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

// TaskRepository - Database

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
