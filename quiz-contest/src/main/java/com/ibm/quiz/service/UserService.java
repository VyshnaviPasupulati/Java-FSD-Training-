package com.ibm.quiz.service;

import java.util.List;

import com.ibm.quiz.entity.Login;
import com.ibm.quiz.entity.User;

public interface UserService  {
int addUser(User u);
	
    User fetchUser(int uid) ;
    User ValidateLogin(Login login);
    List<User> getAllUsers();
	

}
