package com.eva.taskmanager.model;

public class Task {
    /* Atributos privados */
    private String title;
    private boolean completed;

    /* Constructor */
    public Task(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
    /* Getters */
    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

}
