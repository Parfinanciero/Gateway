package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @GetMapping("/unavailble")
    public ResponseEntity<String> unavailble() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Your request cant be processed now, try it leater");
    }
}
