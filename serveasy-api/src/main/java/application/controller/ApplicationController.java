package application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApplicationController {
    
    @RequestMapping("/health")
    public String health() {
        return "Cheers and Serveasy!!!";
    }
}
