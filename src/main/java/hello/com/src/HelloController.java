package hello.com.src;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot. snow in calgary This is Sample applications amoung STS, GIT and Jenkins";
    }
    
}
