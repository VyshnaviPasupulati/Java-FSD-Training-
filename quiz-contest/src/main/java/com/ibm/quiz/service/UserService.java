package com.ibm.quiz.service;

import com.ibm.quiz.entity.User;

public interface UserService  {
int addUser(User u);
	
    User fetchUser(int uid) ;
	

}
