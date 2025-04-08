package com.spring.boot.Application.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value(("${team.name}"))
    private String teamName;

    @GetMapping("/url")
    public String getMsg(){
        return "Hello World!";
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public String toString() {
        return "FunRestController{" +
                "coachName='" + coachName + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
