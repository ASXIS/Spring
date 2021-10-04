package com.training.backend.TestApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductApi {
    @GetMapping("/{id}")
    public ResponseEntity<String> getProductById(@PathVariable("id")String id){
        return ResponseEntity.ok(id);
    }
}
