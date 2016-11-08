/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.repository;

import java.util.List;
import lv.smasys.config.ApplicationConfig;
import lv.smasys.model.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import lv.smasys.repository.StudentRepository;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.mmnaseri.utils.spring.data.dsl.factory.RepositoryFactoryBuilder;

/**
 *
 * @author student
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ApplicationConfig.class, loader = AnnotationConfigContextLoader.class)
//@WebIntegrationTest
public class StudentRepositoryTest {
//    @Autowired
//    StudentRepository studentsRepository;

    public StudentRepositoryTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of findByMail method, of class StudentRepository.
     */
    @Test
    public void testFindByMail() {

        System.out.println("findByMail");
        String mail = "";

        final StudentRepository studentRepository = RepositoryFactoryBuilder.builder().mock(StudentRepository.class);

        studentRepository.save(new Student("Jim", "user", "user", "user", "user"));
        List<Student> resultList = studentRepository.findByMail("user");
        String result = "";
        for (Student s : resultList) {
            result = s.getFirstname();
            System.out.println("NAME " + s.getFirstname());
        }
        String expResult = "Jim";
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
