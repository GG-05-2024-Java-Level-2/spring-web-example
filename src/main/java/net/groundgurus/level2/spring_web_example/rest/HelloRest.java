package net.groundgurus.level2.spring_web_example.rest;

import net.groundgurus.level2.spring_web_example.model.MyMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloRest {
    @GetMapping
    public MyMessage hello() {
        return new MyMessage("Hello World");
    }
}
