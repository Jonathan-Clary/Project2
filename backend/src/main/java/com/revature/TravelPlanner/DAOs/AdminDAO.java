package com.revature.TravelPlanner.DAOs;

import com.revature.TravelPlanner.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO extends JpaRepository<Admin, Integer> {
}
