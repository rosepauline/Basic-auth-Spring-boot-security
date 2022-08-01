package com.dailycodebuffer.springsecuritydemo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    public String home(){
        return "This is Home Page";
    }
    @GetMapping("/admin")
    public String admin(){
        return "This is admin Page";
    }

    @PostMapping("/admin")
    public String admin(@RequestBody User user){
//        userRepository.save(user);
        return "User Created successfully";
    }
}
