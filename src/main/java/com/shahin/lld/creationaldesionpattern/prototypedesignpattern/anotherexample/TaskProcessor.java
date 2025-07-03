package com.shahin.lld.creationaldesionpattern.prototypedesignpattern.anotherexample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class TaskProcessor {

    private final UUID id = UUID.randomUUID();

    public void process(String taskName) {
        System.out.println("Processing task: " + taskName + " | Processor ID: " + id);
    }
}

