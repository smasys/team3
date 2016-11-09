


package lv.smasys.controllers;

import java.util.ArrayList;
import java.util.List;
import lv.smasys.model.Course;
import lv.smasys.model.Lesson;
import lv.smasys.model.Post;
import lv.smasys.model.Student;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author USER
 */
@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teachersRepository;
    @Autowired
    LessonRepository lessonRepository;
    @Autowired
    CourseRepository courseRepository;
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);
    
    @RequestMapping(value = "/posts/teststudent")
    public String listPosts(Model model,Authentication authentication) {  
        String username = getUsername(authentication);
        List<Student> students =studentRepository.findByMail(username);        
        for(Student s : students){  
            if(s.getCourse()!=null){
               
                model.addAttribute("course",s.getCourse()); 
                model.addAttribute("user",s.getFirstname()+" "+s.getLastname()); 
                model.addAttribute("lessons",s.getCourse().getLessons());
            }else{
                model.addAttribute("course",new Course("Add course"));
            }
            
        }
        
        //model.addAttribute("courses", courseRepository.findAll());
        return "posts/teststudent";
    }
    
    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        
        studentRepository.delete(id);
        log.info("Student '"+id+"' deleted");

        return new ModelAndView("redirect:/student");
    }
    
    
    //Add current student to course
    @RequestMapping(value = "/student/join_course", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("courseid") long courseid,Authentication authentication, Model model) {
        String role="";
        String email="";
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            role = authority.getAuthority();
            email = authentication.getName();
        }
        List<Student> students =studentRepository.findByMail(email);
        
        for(Student s : students){
            Course course = courseRepository.findOne(courseid);
            s.setCourse(course);
           studentRepository.save(s);
           model.addAttribute("user",s.getFirstname()+" "+s.getLastname());
           log.info("Student '"+s.getFirstname()+" "+s.getLastname()+"' added to '"+course.getTitle()+"'");
        }
             
        return new ModelAndView("redirect:/posts/teststudent");
    }
    
    public String getUsername(Authentication aut){
        String username="";
        for (GrantedAuthority authority : aut.getAuthorities()) {            
            username = aut.getName();
        }
        return username;
    }
    
    
}
