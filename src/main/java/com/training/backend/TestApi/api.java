package com.training.backend.TestApi;

import com.training.backend.business.TestBusiness;
import com.training.backend.exception.BaseException;
import com.training.backend.exception.UserException;
import com.training.backend.model.MRegisterRequest;
import com.training.backend.model.TestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/test")
public class api {

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
    public ResponseEntity<String> register(@RequestBody MRegisterRequest request) throws BaseException {
        String response = business.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<String> uploadProfilePicture(@RequestPart MultipartFile file) throws BaseException {
        String response = business.uploadProfilePicture(file);
        return ResponseEntity.ok(response);
    }
}

