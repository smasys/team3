


package lv.smasys.controllers;

import lv.smasys.model.Post;
import lv.smasys.model.Student;
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
import org.springframework.web.servlet.ModelAndView;

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
    
    
    @RequestMapping(value = "/teststudent", method = RequestMethod.GET)
    public String listPosts(Model model) {
       
        model.addAttribute("teachers", teachersRepository.findAll());

        return "teststudent";
    }
    
    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        
        studentRepository.delete(id);

        return new ModelAndView("redirect:/student");
    }
}
