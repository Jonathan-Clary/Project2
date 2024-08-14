package com.revature.TravelPlanner.services;

import com.revature.TravelPlanner.DAOs.AdminDAO;
import com.revature.TravelPlanner.mappers.AdminMapper;
import com.revature.TravelPlanner.models.Admin;
import com.revature.TravelPlanner.models.DTOs.OutgoingAdminDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class AdminService {

    //DAOs
    private AdminDAO aDao;

    //Mapper
    private AdminMapper am;

    //Constructor
    @Autowired
    public AdminService(AdminDAO aDao) {
        this.aDao = aDao;
    }

    //Service Methods

    //Method to return OutgoingAdmins to the controller
    public List<OutgoingAdminDTO> getAllAdmins() {

        List<Admin> al = aDao.findAll();
        List<OutgoingAdminDTO> returnedList = new ArrayList<OutgoingAdminDTO>();

        for (Admin oa : al) {
            returnedList.add(am.toDto(oa));
        }

        return returnedList;

    }
}




