package com.cg.flightmgmt.FlightManagementSystem.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightmgmt.FlightManagementSystem.dto.User;
import com.cg.flightmgmt.FlightManagementSystem.exception.UserNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.service.IUserService;


@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {

		return userService.addUser(user);
	}

	@GetMapping("/readAllUsers")
	public List<User> readAllUsers() throws UserNotFoundException {

		return userService.viewUser();
	}
	
	@GetMapping("/readUser/{id}")
	@ExceptionHandler(UserNotFoundException.class)
	public User searchUserByID(@PathVariable("id") BigInteger userId) {

		return userService.findUserById(userId);
	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User updateUser) throws UserNotFoundException {

		return userService.updateUser(updateUser);
	}


	@DeleteMapping("/deleteUser/{id}")
	public void deleteBookingByID(@PathVariable("id") BigInteger userId) throws UserNotFoundException {

		userService.removeUser(userId);
	}
}
