package avatar.rain.monitor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String user() {

        return "hello monitor!";
    }
}
