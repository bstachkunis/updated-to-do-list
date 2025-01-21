package com.example.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Task - Task data/object that will be used for each user entered task

@Entity // Mapping Task to be a database entity
public class Task {
    // set the variables that will be needed for that to-do list
    @Id // Mark the id field as the primary key of the data
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Database will auto assign unique id
    private Long id;

    private String title;
    private String description;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
}
