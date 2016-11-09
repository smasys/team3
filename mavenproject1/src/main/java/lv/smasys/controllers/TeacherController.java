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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

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
    private static final Logger log = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/posts/testteacher")
    public String listCourses(Model model, Authentication authentication) {
        String username = getUsername(authentication);
        List<Teacher> teachers = teacherRepository.findByMail(username);
        for (Teacher t : teachers) {
            if (t.getCourses() != null) {
                //model.addAttribute("course",t.getCourses()); 
                model.addAttribute("courses", t.getCourses());
                model.addAttribute("user",t.getFirstname()+" "+t.getLastname()); 
                model.addAttribute("lessons", t.getLessons());
            } else {
                model.addAttribute("course", new Course("Add course"));
            }
            model.addAttribute("user",t.getFirstname()+" "+t.getLastname()); 
        }

        //model.addAttribute("courses", courseRepository.findAll());
        return "posts/testteacher";
    }

    public String getUsername(Authentication aut) {
        String username = "";
        for (GrantedAuthority authority : aut.getAuthorities()) {
            username = aut.getName();
        }
        return username;
    }

    @RequestMapping(value = "/newlesson", method = RequestMethod.GET)
    public String newLesson(Authentication authentication, Model model) {
        List<Teacher> teachers = teacherRepository.findByMail(getUsername(authentication));
        for (Teacher t : teachers) {
        model.addAttribute("user",t.getFirstname()+" "+t.getLastname()); 
        }
        return "posts/newlesson";
    }

    @RequestMapping(value = "/newcourse", method = RequestMethod.GET)
    public String newCourse(Authentication authentication, Model model) {
        List<Teacher> teachers = teacherRepository.findByMail(getUsername(authentication));
        for (Teacher t : teachers) {
        model.addAttribute("user",t.getFirstname()+" "+t.getLastname()); 
        }
        return "posts/newcourse";
    }

    @RequestMapping(value = "/create_lesson", method = RequestMethod.POST)
    public String createLesson(Model model, @RequestParam("title") String title, @RequestParam("crpoints") double crpoints, @RequestParam("description") String description, @RequestParam("courseid") long courseid, @RequestParam("password") String password, Authentication authentication) {

        List<Teacher> teachers = teacherRepository.findByMail(getUsername(authentication));
        for (Teacher t : teachers) {
            model.addAttribute("user",t.getFirstname()+" "+t.getLastname()); 
            Lesson lesson = new Lesson(title, crpoints, t);
            lesson.setCourse(courseRepository.findOne(courseid));
            if (description != null) {
                lesson.setDescription(description);
            }
            if (courseRepository.findOne(courseid).getPassword().equals(password)) {

                lessonRepository.save(lesson);

                log.info("Lesson '" + lesson.getTitle() + "' created by " + t.getFirstname() + " " + t.getLastname());
            } else {
                model.addAttribute("message", "Wrong Password!");
                log.error("Can't create new lesson: Wrong Password");
                return "posts/newlesson";
            }
        }

        return "redirect:posts/testteacher";
    }

    @RequestMapping(value = "/create_course", method = RequestMethod.POST)
    public String createCourse(@RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("password") String password,
            Authentication authentication) {

        List<Teacher> teachers = teacherRepository.findByMail(getUsername(authentication));
        for (Teacher t : teachers) {
                        
            Course course = new Course(title);
            course.setTeacher(t);
            course.setDescription(description);
            course.setPassword(password);
            courseRepository.save(course);
            log.info("Course '" + course.getTitle() + "' created by " + t.getFirstname() + " " + t.getLastname());
        }

        return "redirect:posts/testteacher";
    }
            @RequestMapping(value = "/lesson/{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable long id) {     
        lessonRepository.delete(id);
        return "redirect:/posts/testteacher";
    }
}
