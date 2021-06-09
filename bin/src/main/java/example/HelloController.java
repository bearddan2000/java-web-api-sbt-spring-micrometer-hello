package example;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";

    /**
     * The @Timed annotation adds timing support, so we can see how long
     * it takes to execute in Prometheus
     * percentiles
     */
    @GetMapping("/")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format(template, name);
    }

}
