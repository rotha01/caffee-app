package com.mystore.caffeeapp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/caffee")
@RequiredArgsConstructor
public class CaffeeRestCoontroller {

    private final CaffeeRepository caffeeRepository;

    @GetMapping("")
    public Map<String, Object> getAllCaffeeList() {
        Map<String, Object> response = new HashMap<>();
        response.put("message","Get caffee successfully!");
        response.put("status_code", HttpStatus.OK.value());
        response.put("payload",caffeeRepository.getCaffeeList());
        return  response;
    }

    @GetMapping("/{code}")
    public Map<String, Object> getCaffeeByCode(@PathVariable String code) {
        Map<String, Object> response = new HashMap<>();
        var result = caffeeRepository.getCaffeeByCode(code);

        if(result.isPresent()){
            Caffee caffee = result.get();
            response.put("message","Get caffee successfully!");
            response.put("status_code", HttpStatus.OK.value());
            response.put("payload",caffee);
        }else{
            response.put("message","Caffee not found!");
            response.put("status_code", HttpStatus.NOT_FOUND.value());
        }

        return  response;
    }

}
