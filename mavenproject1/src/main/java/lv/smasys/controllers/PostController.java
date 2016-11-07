package lv.smasys.controllers;

import lv.smasys.model.Post;
import lv.smasys.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/posts")
public class PostController {
    
    private static final Logger log = LoggerFactory.getLogger(PostController.class);
    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPosts(Model model, Authentication authentication) {       
       
        model.addAttribute("posts", repository.findAll());

        return "posts/list";
    }


    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        repository.delete(id);
        log.info("Post '"+id+"' deleted");
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newProject() {
        return "posts/new";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("message") String comment) {
        repository.save(new Post(comment));
        log.info("Post created");
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("post_id") long id,
            @RequestParam("message") String message) {
        Post post = repository.findOne(id);
        post.setMessage(message);
        repository.save(post);
        log.info("Post '"+id+"' updated");
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id,
            Model model) {
        Post post = repository.findOne(id);
        model.addAttribute("post", post);
        log.info("Post '"+id+"' edited");
        return "posts/edit";
    }

    @RequestMapping("/info")
    public @ResponseBody
    String userInfo(Authentication authentication) {
        String msg = "";
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            String role = authority.getAuthority();
            msg = msg + authentication.getName() + ", You have " + role;
        }
        return msg;
    }

}
