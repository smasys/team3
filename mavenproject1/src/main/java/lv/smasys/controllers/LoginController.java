/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import lv.smasys.model.Course;
import lv.smasys.model.Post;
import lv.smasys.model.Student;
import lv.smasys.repository.StudentRepository;
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
    StudentRepository repository;
    
    
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
            ,@RequestParam("password") String password) {
        repository.save(new Student(name, surname, phone, email, password));
        
        return "posts/login";
    }
    
   
//    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
//    public String checkLogin(@RequestParam("user_login") String login,
//                               @RequestParam("user_pass") String password) {
//        Iterator<Student> iterator = repository.findAll().iterator();
//       
//        while(iterator.hasNext()){
//           Student student = iterator.next();
//           if(student.getMail().equals(login) && student.getPassword().equals(password)){
//               return "posts/list";
//           }
//        }
//        //model.addAttribute("student", student);
//        return "posts/login";
//    }
    
    
}
