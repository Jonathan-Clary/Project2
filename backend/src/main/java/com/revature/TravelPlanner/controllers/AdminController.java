package com.revature.TravelPlanner.controllers;

import com.revature.TravelPlanner.models.DTOs.OutgoingAdminDTO;
import com.revature.TravelPlanner.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    //Service Variable(s)
    private AdminService as;

    //Constructor
    @Autowired
    public AdminController(AdminService as) {
        this.as = as;
    }

    //Mappings
    @GetMapping
    public List<OutgoingAdminDTO> getAllAdmins() {
        return as.getAllAdmins();
    }
}
