package com.revature.TravelPlanner.services;

import com.revature.TravelPlanner.DAOs.StaysDAO;
import com.revature.TravelPlanner.DAOs.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaysService {

    private StaysDAO staysDAO;

    @Autowired
    public StaysService(StaysDAO staysDAO) {
        this.staysDAO = staysDAO;
    }
}
