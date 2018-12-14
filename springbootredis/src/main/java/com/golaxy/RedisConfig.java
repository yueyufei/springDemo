package com.golaxy;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

//	@Bean
//	public JedisConnectionFactory jedisConnectionFactory() {
//		 JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
//		 jedisConnectionFactory.setHostName("192.168.72.133");
//		 jedisConnectionFactory.setPort(6379);
//		 return jedisConnectionFactory;
//	}

	@Bean
	public RedisTemplate<String, User> redisTemplate(RedisConnectionFactory factory) {
		RedisTemplate<String, User> template = new RedisTemplate<String, User>();
		template.setConnectionFactory(factory);
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new RedisObjectSerializer());
		return template;
	}

}
