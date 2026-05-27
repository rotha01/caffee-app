package com.mystore.caffeeapp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/caffee")
public class CaffeeRestCoontroller {

    @GetMapping("")
    public Map<String, Object> getAllCaffeeList() {
        Map<String, Object> response = new HashMap<>();
        response.put("message","Get caffee successfull!");
        response.put("status_code", HttpStatus.OK.value());
        response.put("payload",CaffeeRepository.getCaffeeList());
        return  response;
    }

    @GetMapping("/{code}")
    public Map<String, Object> getCaffeeByCode(@PathVariable String code) {
        Map<String, Object> response = new HashMap<>();
        response.put("message","Get caffee successfull!");
        response.put("status_code", HttpStatus.OK.value());
        response.put("payload",CaffeeRepository.getCaffeeByCode(code));;
        return  response;
    }

}
