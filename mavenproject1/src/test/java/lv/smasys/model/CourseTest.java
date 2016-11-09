/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class CourseTest {
    
    public CourseTest() {
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
     * Test of getCourseid method, of class Course.
     */
    @Test
    public void testGetCourseid() {
        System.out.println("getCourseid");
        Course instance = new Course();
        instance.setCourseid(666l);
        long expResult = 666l;
        long result = instance.getCourseid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setCourseid method, of class Course.
     */
    @Test
    public void testSetCourseid() {
        System.out.println("setCourseid");
        long courseid = 0L;
        Course instance = new Course();
        instance.setCourseid(courseid);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTitle method, of class Course.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Course instance = new Course();
        instance.setTitle("Da_best_lesson!");
        String expResult = "Da_best_lesson!";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTitle method, of class Course.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Course instance = new Course("JTl");
        
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassword method, of class Course.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Course instance = new Course();
        instance.setPassword("2cul4school");
        String expResult = "2cul4school";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPassword method, of class Course.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Course instance = new Course();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDescription method, of class Course.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Course instance = new Course();
        instance.setDescription("Joind the Dark Side!");
        String expResult = "Joind the Dark Side!";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDescription method, of class Course.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Course instance = new Course();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLessons method, of class Course.
     */
    @Test
    public void testGetLessons() {
        System.out.println("getLessons");
        Course instance = new Course();
        List<Lesson> expResult = null;
        List<Lesson> result = instance.getLessons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTeacher method, of class Course.
     */
    @Test
    public void testGetTeacher() {
        System.out.println("getTeacher");
        Course instance = new Course();
        Teacher expResult = null;
        Teacher result = instance.getTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTeacher method, of class Course.
     */
    @Test
    public void testSetTeacher() {
        System.out.println("setTeacher");
        Teacher teacher = null;
        Course instance = new Course();
        instance.setTeacher(teacher);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLessons method, of class Course.
     */
    @Test
    public void testSetLessons() {
        System.out.println("setLessons");
        List<Lesson> lessons = null;
        Course instance = new Course();
        instance.setLessons(lessons);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getStudents method, of class Course.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Course instance = new Course();
        List<Student> expResult = null;
        List<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setStudents method, of class Course.
     */
    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        List<Student> students = null;
        Course instance = new Course();
        instance.setStudents(students);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
