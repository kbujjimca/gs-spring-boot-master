package hello.com.src;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot. snow in calgary in spring This is Sample applications amoung STS, GIT and Jenkins";
    }
    
}
