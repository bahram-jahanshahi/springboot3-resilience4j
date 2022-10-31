package se.bahram.springboot3resilience4j.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.bahram.springboot3resilience4j.records.Call;

@RestController
@RequestMapping("/simple-rest")
public class SimpleRestController {

    @GetMapping("/call")
    private ResponseEntity<Call> call() {

        Call call = new Call(1, "0739346127");

        return ResponseEntity.ok(call);
    }
}

