package com.eva.taskmanager.controller;

import com.eva.taskmanager.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/** Qué debes entender (sin memorizar):
 Es una clase Java
 Tiene un método
 Spring lo conecta a una URL */

@RestController
public class HelloController {

    // Lista de tareas
    @GetMapping("/tasks")
    public List<Task> getTasks() {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Estudiar Spring Boot", false));
        tasks.add(new Task("Hacer ejercicio", true));
        tasks.add(new Task("Estudiar Microservicios", true));

        return tasks;

    }

}
