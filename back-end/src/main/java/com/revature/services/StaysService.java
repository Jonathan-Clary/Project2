package com.revature.services;

import com.revature.DAOs.StaysDAO;
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
