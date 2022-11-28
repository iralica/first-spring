package com.example.firstspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    String test()
    {
        return "<h1>Its a test!</h1>";
    }

}
