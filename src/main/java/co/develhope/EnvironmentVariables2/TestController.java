package co.develhope.EnvironmentVariables2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return welcomeMsg;
    }
}