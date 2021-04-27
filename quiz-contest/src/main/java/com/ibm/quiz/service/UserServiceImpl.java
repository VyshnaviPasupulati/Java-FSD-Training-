package com.ibm.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.quiz.entity.User;
import com.ibm.quiz.repo.UserReposiory;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserReposiory repo;
	@Override
	public int addUser(User u) {
		repo.save(u);
		return u.getUid();
	}

	@Override
	public User fetchUser(int uid)  {
		return repo.findById(uid).get();
	}


}
