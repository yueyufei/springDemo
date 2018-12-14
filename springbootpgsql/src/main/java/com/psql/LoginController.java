package com.psql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class LoginController {  

  @Autowired  
  UserRepository userRepository;  
    
  @RequestMapping("/")  
  public String home() {  
      return "index";  
  }  
    
    
  @RequestMapping(value="/user")  
  public List<User1> userList(){  
      return userRepository.findAll();  
  }  
//  public String testDataBase(Map<String, Object> model){  
//      //Long id = (long) 1;  
//      Student stu = studentRepository.findStudentById(id);  
//      model.put("student", stu);  
//      return "testDataBase";  
//  }  
}  
