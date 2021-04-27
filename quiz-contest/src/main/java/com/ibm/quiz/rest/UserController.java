package com.ibm.quiz.rest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.quiz.entity.Login;
import com.ibm.quiz.entity.User;
import com.ibm.quiz.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	/*
	 * @PostMapping(value = "/add/{name}") public String
	 * addUser(@PathVariable("name") String name){ User u = new User();
	 * u.setUsername(name); int uid = service.addUser(u); return
	 * "User added with id " + uid ; }
	 */
	
//	@PostMapping(value = "/add")
//    public String addUserParam(@RequestParam("name") String name){
//		User u = new User();
//		u.setUsername(name);
//		int uid = service.addUser(u);
//		return "User added with ID" + uid;
//	}
//	
	@PostMapping(value = "/add", consumes = "application/json")
    public String addUserBody(@RequestBody User u){
		int uid = service.addUser(u);
		return "User added with ID" + uid;
	}
	@PostMapping(value="/auth",consumes="application/json")
	public ResponseEntity<?> authenticate(@RequestBody Login login, HttpSession sesion) {
		User user =  service.ValidateLogin(login);
		if(user != null) {
			sesion.setAttribute("USER",user);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Invalid Username or Password ", HttpStatus.NOT_FOUND);
	}
	@GetMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logged out successfully";
	}
	@GetMapping(value = "/get/{uid}", produces = "application/json")
    public User fetchUser(@PathVariable("uid") int uid)  {
		User u = service.fetchUser(uid);
		return u;
	}
	

}
