package com.cg.flightmgmt.FlightManagementSystem.repositary;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flightmgmt.FlightManagementSystem.dto.User;
import com.cg.flightmgmt.FlightManagementSystem.exception.UserNotFoundException;

@Repository
public interface IUserRepository extends JpaRepository<User, BigInteger> {
		User findByUserId(BigInteger userid);
		User findOne(BigInteger userid);
	}
