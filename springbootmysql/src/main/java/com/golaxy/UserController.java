package com.golaxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  
@EnableAutoConfiguration   
public class UserController {    
    @Autowired    
    private UserDao userDao;    
    @RequestMapping("/getAllStudent")
    @ResponseBody
    public List<User> getAllStudent(){  
        return userDao.findAll();
    }  
    @PostMapping("/addStudent")  
    public User addStudent(@RequestParam("name") String name, @RequestParam("sex") String sex){  
    	User student=new User();  
        student.setName(name);  
        student.setSex(sex); 
        return userDao.save(student);  
    } 
}    
