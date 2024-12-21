package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {
    @GetMapping("/hello")
    public String hello(){

        return "Hello World";
    }
    
    @GetMapping("/model")
    public ResponseEntity<DemoModel> getModel(@RequestParam int id){
        DemoModel model = new DemoModel(id, "Test");
        return new ResponseEntity<>(model,HttpStatus.OK);
    }


}
