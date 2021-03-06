/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.controllers;

import java.util.ArrayList;
import java.util.List;
import lv.smasys.model.Authorities;
import lv.smasys.model.Post;
import lv.smasys.model.Roles;
import lv.smasys.model.Student;
import lv.smasys.model.Teacher;
import lv.smasys.model.User;
import lv.smasys.repository.AuthoritiesRepository;
import lv.smasys.repository.CourseRepository;
import lv.smasys.repository.LessonRepository;
import lv.smasys.repository.StudentRepository;
import lv.smasys.repository.TeacherRepository;
import lv.smasys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    @Autowired
    LessonRepository lessonRepository;
    @Autowired
    CourseRepository courseRepository;
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    public static boolean isName(String name) {
        boolean status = false;
        char[] chars = name.toCharArray();

        if (Character.isUpperCase(chars[0])) {
            for (char c : chars) {
                if (Character.isLetter(c)) {
                    status = true;
                }
            }
        }
        return status;
    }

    public static boolean isTelNumber(String telephoneNumber) {
        boolean status = false;
        if (telephoneNumber.matches("[2]{1}\\d{7}")
                || (telephoneNumber.matches("[3][7][1][2]\\d{7}"))
                || (telephoneNumber.matches("[+][3][7][1][2]\\d{7}"))) {
            status = true;
        }
        System.out.println("Number=" + status);
        return status;
    }

    public static boolean isEmail(String email) {
        boolean status = false;
        if (email.matches(".+@.+\\.[a-z]+")) {
            status = true;
        }
        System.out.println("Email=" + status);
        return status;
    }

//    //@RequestMapping("/{userId}/bookmarks")
//    @RequestMapping(value="/",method=RequestMethod.POST)
//    public String success() {
//        return "redirect:posts/list";
//    }
//    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "posts/login";
    }

    @RequestMapping(value = "/createuser", method = RequestMethod.GET)
    public String newUser(Model model) {
        List<Roles> list = new ArrayList<Roles>();
        list.add(new Roles("ROLE_USER"));
        list.add(new Roles("ROLE_ADMIN"));
        model.addAttribute("userroles", list);
        return "createuser";
    }

    @RequestMapping(value = "/create_user", method = RequestMethod.POST)
    public String create(@RequestParam("name") String name,
            @RequestParam("surname") String surname,
            @RequestParam("phone") String phone,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("roles") String role) {
        if (!name.equals("") && !surname.equals("") && !phone.equals("") && !email.equals("") && !password.equals("")) {
            if (isName(name) && isName(surname) && isTelNumber(phone) && isEmail(email)) {
                if (role.equals("ROLE_USER")) {
                    studentRepository.save(new Student(name, surname, phone, email, password));
                    User u = new User(email, password);
                    u.setEnabled(true);
                    userRepository.save(u);
                    authoritiesRepository.save(new Authorities(email, role));
                    log.info("USER '" + name + " " + surname + "' created");

                } else if (role.equals("ROLE_ADMIN")) {
                    teacherRepository.save(new Teacher(name, surname, phone, email, password));
                    User u = new User(email, password);
                    u.setEnabled(true);
                    userRepository.save(u);
                    authoritiesRepository.save(new Authorities(email, role));
                    log.info("ADMIN '" + name + " " + surname + "' created");
                }
            } else {
                
                log.error("Can't create new " + role + ": Wrong input");
             //   model.addAttribute("fail","Wrong input, user was not created!");
                
                return "createuser";
            }
        } else {
            log.error("Can't create new " + role + ": Empty input");
          //  model.addAttribute("fail","Please fill all the fields!");
            return "createuser";
        }

        return "posts/login";
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String listPosts(Model model, Authentication authentication) {
        String role = "";
        String name = "";
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            role = authority.getAuthority();
            name = authentication.getName() + role;
        }
        if (role.equals("ROLE_USER")) {
            model.addAttribute("courses", courseRepository.findAll());
            return "redirect:/posts/teststudent";
        } else if (role.equals("ROLE_ADMIN")) {
            return "redirect:/posts/testteacher";
        }
        return "redirect:/?logout";
    }

}
