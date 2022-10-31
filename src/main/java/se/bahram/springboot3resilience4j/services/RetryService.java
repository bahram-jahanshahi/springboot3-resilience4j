package se.bahram.springboot3resilience4j.services;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;
import se.bahram.springboot3resilience4j.records.RetryMessageRecord;

@Service
public class RetryService {

    @Retry(name = "serviceA", fallbackMethod = "myFallBack")
    public String call() {

        throw new RuntimeException("Runtime Exception on Retry Service call method.");
    }

    public String myFallBack(RuntimeException runtimeException) {

        return  "Fallback is called";
    }
}
