package com.sivaexercise.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/codeDeploy")
public class CodeDeployDemo {

    @GetMapping("/demo")
    public String demo(){
        log.debug("Code deploy Demo");
        return "Successful Code Deploy";
    }


}
