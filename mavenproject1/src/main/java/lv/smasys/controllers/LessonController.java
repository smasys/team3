/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.controllers;

import java.util.List;
import lv.smasys.model.Course;
import lv.smasys.model.Lesson;
import lv.smasys.model.Post;
import lv.smasys.model.Student;
import lv.smasys.model.Teacher;
import lv.smasys.repository.CourseRepository;
import lv.smasys.repository.LessonRepository;
import lv.smasys.repository.StudentRepository;
import lv.smasys.repository.TeacherRepository;
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

/**
 *
 * @author student
 */
@Controller
public class LessonController {
    
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    CourseRepository courseRepository; 
    @Autowired
    LessonRepository lessonRepository;
    @Autowired
    StudentRepository studentRepository;
    
//     @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public ModelAndView update(@RequestParam("post_id") long id,
//            @RequestParam("message") String message) {
//        Post post = repository.findOne(id);
//        post.setMessage(message);
//        repository.save(post);
//        return new ModelAndView("redirect:/posts");
//    }

    @RequestMapping(value = "lessons/{id}/show", method = RequestMethod.GET)
    public String showLesson(@PathVariable long id,
            Model model, Authentication authentication) {
        Lesson lesson = lessonRepository.findOne(id);
        Course course = lesson.getCourse();        
        
        String username = getUsername(authentication);
        if("ROLE_ADMIN".equals(getRole(authentication))){
            
            List<Teacher> teachers =teacherRepository.findByMail(username);
            for(Teacher t : teachers){                
                model.addAttribute("user",t.getFirstname()+" "+t.getLastname());
            }
        }else{
            List<Student> students =studentRepository.findByMail(username);        
            for(Student s : students){
                model.addAttribute("user",s.getFirstname()+" "+s.getLastname());
            }
        }
                
        model.addAttribute("lesson", lesson);
        model.addAttribute("students", course.getStudents());
        return "posts/lessonpage";
    }
    //Show Course page 
    @RequestMapping(value = "course/{id}/show", method = RequestMethod.GET)
    public String showCourse(@PathVariable long id,
            Model model, Authentication authentication) {
       // Lesson lesson = lessonRepository.findOne(id);
        Course course = courseRepository.findOne(id);
        
        String username = getUsername(authentication);
        if("ROLE_ADMIN".equals(getRole(authentication))){
            
            List<Teacher> teachers =teacherRepository.findByMail(username);
            for(Teacher t : teachers){                
                model.addAttribute("user",t.getFirstname()+" "+t.getLastname());
            }
        }else{
            List<Student> students =studentRepository.findByMail(username);        
            for(Student s : students){
                model.addAttribute("user",s.getFirstname()+" "+s.getLastname());
            }
        }
        
        model.addAttribute("course", course);
        model.addAttribute("students", course.getStudents());
        model.addAttribute("role",getRole(authentication));
        return "posts/coursepage";
    }
    //Remove Student from course
    @RequestMapping(value = "/course/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        Student s = studentRepository.findOne(id);
        long ids=s.getCourse().getCourseid();
        s.setCourse(null);
        
        studentRepository.save(s);

        return new ModelAndView("redirect:/course/"+ids+"/show");
    }
    
     public String getRole(Authentication aut) {
        String role = "";
        for (GrantedAuthority authority : aut.getAuthorities()) {
            role = authority.getAuthority();
        }
        return role;
    }
       public String getUsername(Authentication aut){
        String username="";
        for (GrantedAuthority authority : aut.getAuthorities()) {            
            username = aut.getName();
        }
        return username;
    }
    
}
