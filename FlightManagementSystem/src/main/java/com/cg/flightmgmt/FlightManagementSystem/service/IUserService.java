package com.cg.flightmgmt.FlightManagementSystem.service;



import java.math.BigInteger;
import java.util.List;



import com.cg.flightmgmt.FlightManagementSystem.dto.User;
import com.cg.flightmgmt.FlightManagementSystem.exception.UserNotFoundException;



public interface IUserService {



public User addUser(User user);
public User viewUser(BigInteger userid) throws UserNotFoundException;
public List<User> viewUser() throws UserNotFoundException;
public User updateUser(User user) throws UserNotFoundException;
public void removeUser(BigInteger userid) throws UserNotFoundException;
public void validateUser(User user) throws UserNotFoundException;
public User findUserById(BigInteger userId);

}