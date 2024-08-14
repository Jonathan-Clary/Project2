package com.revature.DAOs;

import com.revature.models.Stays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaysDAO extends JpaRepository<Stays, Integer> {


}
