/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.repository;

import com.mmnaseri.utils.spring.data.dsl.factory.RepositoryFactoryBuilder;
import java.util.List;
import lv.smasys.model.Student;
import lv.smasys.model.Teacher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class TeacherRepositoryTest {
    
    public TeacherRepositoryTest() {
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
     * Test of findByMail method, of class TeacherRepository.
     */
    @Test
    public void testFindByMail() {
         System.out.println("findByMail");
        String mail = "";

        final TeacherRepository teacherRepository = RepositoryFactoryBuilder.builder().mock(TeacherRepository.class);

        teacherRepository.save(new Teacher("Jim", "user", "user", "user", "user"));
        List<Teacher> resultList = teacherRepository.findByMail("user");
        String result = "";
        for (Teacher s : resultList) {
            result = s.getFirstname();
            System.out.println("NAME " + s.getFirstname());
        }
        String expResult = "Jim";
        System.out.println(result);
        assertEquals(expResult, result);
    }

    
    
}
