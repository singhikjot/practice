package com.ikjot.practice.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirthdayController {

    @GetMapping("/birthday")
    public String getBirthdayMessage() {
        return "happy birthday";
    }
}

