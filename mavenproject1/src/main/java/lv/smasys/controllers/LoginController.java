/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.controllers;

import lv.smasys.model.Authorities;
import lv.smasys.model.Student;
import lv.smasys.model.Teacher;
import lv.smasys.model.User;
import lv.smasys.repository.AuthoritiesRepository;
import lv.smasys.repository.StudentRepository;
import lv.smasys.repository.TeacherRepository;
import lv.smasys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author edgars
 */
@Controller
public class LoginController {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    AuthoritiesRepository authoritiesRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    TeacherRepository teacherRepository;
    
//    //@RequestMapping("/{userId}/bookmarks")
//    @RequestMapping(value="/",method=RequestMethod.POST)
//    public String success() {
//        return "redirect:posts/list";
//    }
//    
    @RequestMapping(value="/",method=RequestMethod.GET)
    public String index() {
        return "posts/login";
    }
    @RequestMapping(value="/createuser",method=RequestMethod.GET)
    public String newUser() {
        return "createuser";
    }
    
    
    @RequestMapping(value = "/create_user", method = RequestMethod.POST)
    public String create(@RequestParam("name") String name
            ,@RequestParam("surname") String surname
            ,@RequestParam("phone") String phone
            ,@RequestParam("email") String email
            ,@RequestParam("password") String password
            ,@RequestParam("role") String role) {
        
        if(role.equals("ROLE_USER")){
            studentRepository.save(new Student(name, surname, phone, email, password));
            User u = new User(email,password);
            u.setEnabled(true);
            userRepository.save(u);
            authoritiesRepository.save(new Authorities(email,role));
            
        }else if(role.equals("ROLE_ADMIN")){
            teacherRepository.save(new Teacher(name, surname, phone, email, password));
            User u = new User(email,password);
            u.setEnabled(true);
            userRepository.save(u);            
            authoritiesRepository.save(new Authorities(email,role));
        }
        
        return "posts/login";
    }   
   

    
}
