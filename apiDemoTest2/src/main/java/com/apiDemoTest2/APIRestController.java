package com.apiDemoTest2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class APIRestController {

    @PostMapping("/consumer_services")
    public ResponseEntity<Object> cdiController
            (@RequestBody CustomerDetailedInquiry customerDetailedInquiry){
        System.out.println("Found");
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
