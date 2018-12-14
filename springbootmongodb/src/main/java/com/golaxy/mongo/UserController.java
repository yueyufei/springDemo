package com.golaxy.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/get")
	public List<User> get(){
		userRepository.save(new User(1L, "刘备", 50));
		userRepository.save(new User(2L, "关羽", 40));
		userRepository.save(new User(3L, "张飞", 30));
		List<User> allUser = userRepository.findAll();
		return allUser;
	}

}
