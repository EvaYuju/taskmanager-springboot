package com.eva.taskmanager.controller;

import com.eva.taskmanager.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Qué debes entender (sin memorizar):
 Es una clase Java
 Tiene un método
 Spring lo conecta a una URL */

@RestController
public class HelloController {

    @GetMapping("/task")
    public Task getTask() {
        return new Task("Estudiar Spring Boot" , false);
    }

}
