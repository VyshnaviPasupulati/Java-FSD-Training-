package com.ibm.quiz.service;

import java.util.List;

import com.ibm.quiz.entity.Login;
import com.ibm.quiz.entity.User;
import com.ibm.quiz.exception.InvalidRequestException;

public interface UserService  {
int addUser(User u);
	
    User fetchUser(int uid) throws InvalidRequestException ;
    User ValidateLogin(Login login);
    List<User> getAllUsers();
	

}
