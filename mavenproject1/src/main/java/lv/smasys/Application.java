package lv.smasys;

import lv.smasys.model.Post;
import lv.smasys.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private PostRepository repository;
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        log.info("Starting application");
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        for (int i = 0; i < 5; i++) {
//            repository.save(new Post("My post number #" + (i+1)));
//        }
        
    }
    
}
