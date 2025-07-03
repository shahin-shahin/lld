package com.shahin.lld.creationaldesionpattern.prototypedesignpattern.anotherexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private ApplicationContext context;  // Needed to manually fetch prototype bean

    @GetMapping("/run-task")
    public String runTask(@RequestParam String name) {
        TaskProcessor processor1 = context.getBean(TaskProcessor.class);
        processor1.process(name + " - 1");

        TaskProcessor processor2 = context.getBean(TaskProcessor.class);
        processor2.process(name + " - 2");

        boolean sameInstance = processor1 == processor2;

        return "Same instance? " + sameInstance; // Should print: false
    }
}
