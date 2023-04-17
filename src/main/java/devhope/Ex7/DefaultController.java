package devhope.Ex7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String hello(){
        return "Hello from Spring Calculator Application :D (port 5050)";

    }

}
