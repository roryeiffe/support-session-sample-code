package com.revature.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Our controller layer is responsible for accepting requests and doing "something" with it
// Usually, it's just passing on the data to be handled by a service
// First, we have to specify that this class is a controller:
@RestController
// because we are annotating this at the class level, every endpoint in this class will be prefaced by "hello"
@RequestMapping("/hello")
public class HelloController {

    // specify that when we navigate to this endpoint, it's going to be a get request, and this method is going to be triggered
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String hello() {
        System.out.println("This method was triggered");
        return "Hello World";
    }
}
