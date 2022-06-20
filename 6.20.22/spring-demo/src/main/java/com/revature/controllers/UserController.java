package com.revature.controllers;

import com.revature.entity.User;
import org.springframework.web.bind.annotation.*;

// specify that this is a controller class:
@RestController
// this helps with organizing endpoints because any method in this class will start with "/users"
@RequestMapping("/users")
public class UserController {

    // READ
    // For each entity (so in this case, users), we usually want CRUD (Create, Read, Update, Delete)
    // equivalent to @ReqeustMapping, method = RequestMethod.GET)
    @GetMapping("/{userId}") // read whichever value is in the path and then return dummy data but it will use the value that we pass in:
    public User getUser(@PathVariable("userId") Long userId) {
        // normally, you would get this info from database, but in this case, we just return some dummy data:
        return new User(userId, "default", "default password");
    }

    // CREATE
    @PostMapping("")
    // the @request body annotation tells us to look at the body that we pass in:
    public void addUser(@RequestBody User user) {
        System.out.println("User => " + user.toString());
    }

}
