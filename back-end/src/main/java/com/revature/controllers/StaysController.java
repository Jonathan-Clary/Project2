package com.revature.controllers;


import com.revature.services.StaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stays")
@CrossOrigin
public class StaysController {

    private StaysService staysService;

    @Autowired
    public StaysController(StaysService staysService) {
        this.staysService = staysService;
    }
}
