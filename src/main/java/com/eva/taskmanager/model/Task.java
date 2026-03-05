package com.eva.taskmanager.model;

public class Task {
    /* Atributos privados */
    private int id;
    private String title;
    private boolean completed;


    /* Constructor */
    public Task(int id, String title, boolean completed) {
        this.id = id;
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

    public int getId() {
        return id;
    }
}
