package com.ibm.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.quiz.entity.Login;
import com.ibm.quiz.entity.User;
import com.ibm.quiz.exception.InvalidRequestException;
import com.ibm.quiz.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repo;
	@Override
	public int addUser(User u) {
		repo.save(u);
		return u.getUid();
	}

	@Override
	public User fetchUser(int uid) throws InvalidRequestException {
		return repo.findById(uid).get();
	}

	@Override
	public User ValidateLogin(Login login) {
		return repo.findbyUserNameAndPassword(login.getUsername(),login.getPasswd());
	}

	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}


}
