package com.golaxy;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;

	@Resource
	private RedisTemplate<String, User> redisTemplate;
	
	
	@RequestMapping(value="/user")
	public User getUser(){
		User user = redisTemplate.opsForValue().get("超人");
		return user;
	}

}
