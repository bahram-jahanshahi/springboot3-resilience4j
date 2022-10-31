package se.bahram.springboot3resilience4j.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.bahram.springboot3resilience4j.records.RetryMessageRecord;
import se.bahram.springboot3resilience4j.services.RetryService;

@RestController
@RequestMapping("/simple-retry")
public class RetryRestController {

    private final RetryService retryService;

    public RetryRestController(RetryService retryService) {
        this.retryService = retryService;
    }

    @GetMapping("/call")
    private ResponseEntity<String> call() {

        return ResponseEntity.ok(retryService.call());
    }
}
