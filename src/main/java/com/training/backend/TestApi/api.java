package com.training.backend.TestApi;

import com.training.backend.business.TestBusiness;
import com.training.backend.model.MRegisterRequest;
import com.training.backend.model.TestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("/test")
public class api{

    private final TestBusiness business;
    public api(TestBusiness business) {
        this.business = business;
    }

    @GetMapping
    public TestResponse test() {
        TestResponse response = new TestResponse();
        response.setFood("tomyum");
        response.setName("frong");
        return response;

    }

    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<String> register(@RequestBody MRegisterRequest request){
        String response = null;
        try {
            response = business.register(request);
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
        }
    }
}

