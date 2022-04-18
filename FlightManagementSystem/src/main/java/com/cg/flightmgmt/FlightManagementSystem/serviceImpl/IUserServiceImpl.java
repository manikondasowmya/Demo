package com.cg.flightmgmt.FlightManagementSystem.serviceImpl;



import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cg.flightmgmt.FlightManagementSystem.dto.User;
import com.cg.flightmgmt.FlightManagementSystem.exception.UserNotFoundException;
import com.cg.flightmgmt.FlightManagementSystem.repositary.IUserRepository;
import com.cg.flightmgmt.FlightManagementSystem.service.IUserService;



@Service
public class IUserServiceImpl implements IUserService {
@Autowired
private IUserRepository userRepo;
@Override
public User addUser(User user) {
return userRepo.save(user);
// Optional<User> findUserById = userRepo.findById(user.getUserId());
// if (!findUserById.isPresent()) {
// return userRepo.save(user);
// }
// else
// {
// //exception
// throw new UserNotFoundException("User with Id: " + user.getUserId() + " not exists!!");
// }
}



@Override
public User updateUser(User user) throws UserNotFoundException {
Optional<User> findUserById = userRepo.findById(user.getUserId());
if (findUserById.isPresent()) {
userRepo.save(user);
} else
throw new UserNotFoundException("User with Id: " + user.getUserId() + "does not exist");
return user;
}



@Override
public void removeUser(BigInteger userid) throws UserNotFoundException {
Optional<User> findBookingById = userRepo.findById(userid);
if (findBookingById.isPresent()) {
userRepo.deleteById(userid);
}
else
throw new UserNotFoundException("User with Id: " + userid + "does not exist");
}



@Override
public User viewUser(BigInteger userid) throws UserNotFoundException {
return userRepo.findByUserId(userid);
}



@Override
public List<User> viewUser() throws UserNotFoundException {
return userRepo.findAll();
}



@Override
public void validateUser(User user) throws UserNotFoundException {
Optional<User> findUserById = userRepo.findById(user.getUserId());
if (findUserById.isPresent()) {
String checker = "^[A-Za-z0-9]+@(.+)$";
Pattern pattern = Pattern.compile(checker);
//user phone count should be 10 and not start with 0
if(user.getUserPhone().length()!=10&&String.valueOf(user.getUserPhone()).charAt(0)!='0') {
throw new UserNotFoundException("User with Id: " + user.getUserId() + "has incorrect mobile number format");
}
//email should contain no special character
if(!pattern.matcher(user.getUserEmail()).matches()) {
throw new UserNotFoundException("User with Id: " + user.getUserId() + "has incorrect email id format");
}

}
else
throw new UserNotFoundException("User with Id: " + user.getUserId() + "does not exist");

}




@Override
public User findUserById(BigInteger userId) {
return userRepo.getById(userId);
}



}