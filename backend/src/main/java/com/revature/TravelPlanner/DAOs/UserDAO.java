package com.revature.TravelPlanner.DAOs;

import com.revature.TravelPlanner.models.Stays;
import com.revature.TravelPlanner.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
}
