package com.golaxy;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional    
public interface UserDao extends CrudRepository<User, Integer> {    
    public List<User> findByName(String name);   
    public List<User> findBySex(String sex); 
    public List<User> findAll();
} 
