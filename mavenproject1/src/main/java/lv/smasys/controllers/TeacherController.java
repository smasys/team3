package lv.smasys.controllers;

import java.util.List;
import lv.smasys.model.Authorities;
import lv.smasys.model.Course;
import lv.smasys.model.Lesson;
import lv.smasys.model.Student;
import lv.smasys.model.Teacher;
import lv.smasys.model.User;
import lv.smasys.repository.CourseRepository;
import lv.smasys.repository.LessonRepository;
import lv.smasys.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author USER
 */
@Controller
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    CourseRepository courseRepository; 
    @Autowired
    LessonRepository lessonRepository;

    @RequestMapping(value = "/testteacher")
    public String listCourses(Model model, Authentication authentication) {
        String username = getUsername(authentication);
        List<Teacher> teachers = teacherRepository.findByMail(username);
        for (Teacher t : teachers) {
            if (t.getCourses() != null) {
                //model.addAttribute("course",t.getCourses()); 
                model.addAttribute("courses", t.getCourses());
                model.addAttribute("lessons", t.getLessons());
            } else {
                model.addAttribute("course", new Course("Add course"));
            }

        }

        //model.addAttribute("courses", courseRepository.findAll());
        return "testteacher";
    }

    public String getUsername(Authentication aut) {
        String username = "";
        for (GrantedAuthority authority : aut.getAuthorities()) {
            username = aut.getName();
        }
        return username;
    }

    @RequestMapping(value = "/new_lesson", method = RequestMethod.GET)
    public String newLesson( Authentication authentication) {
        return "newlesson";
    }
    
    @RequestMapping(value = "/new_course", method = RequestMethod.GET)
    public String newCourse( Authentication authentication) {
        return "newcourse";
    }
    @RequestMapping(value = "/create_lesson", method = RequestMethod.POST)
    public String createLesson(Model model,@RequestParam("title") String title, @RequestParam("crpoints") double crpoints, @RequestParam("description") String description, @RequestParam("courseid") long courseid,@RequestParam("password") String password, Authentication authentication) {

        List<Teacher> teachers = teacherRepository.findByMail(getUsername(authentication));
        for (Teacher t : teachers) {
            Lesson lesson = new Lesson(title, crpoints, t);            
            lesson.setCourse(courseRepository.findOne(courseid));
            if(description!=null){
                lesson.setDescription(description);
            }
            if(courseRepository.findOne(courseid).getPassword().equals(password)){
                
                lessonRepository.save(lesson);
            }else{
                model.addAttribute("message","Wrong Password!");
                return "newlesson";
            }
        }

        return "redirect:/testteacher";
    }
    
    @RequestMapping(value = "/create_course", method = RequestMethod.POST)
    public String createCourse(@RequestParam("title") String title
            ,@RequestParam("description") String description
            ,@RequestParam("password") String password
            , Authentication authentication) {

        List<Teacher> teachers = teacherRepository.findByMail(getUsername(authentication));
        for (Teacher t : teachers) {
            Course course =new Course(title);
            course.setTeacher(t);
            course.setDescription(description);
            course.setPassword(password);
           courseRepository.save(course);
        }

        return "redirect:/testteacher";
    }
}
