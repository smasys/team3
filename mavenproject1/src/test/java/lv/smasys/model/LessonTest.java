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
public class LessonTest {
    
    public LessonTest() {
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
     * Test of getLessonid method, of class Lesson.
     */
    @Test
    public void testGetLessonid() {
        System.out.println("getLessonid");
        Lesson instance = new Lesson();
        instance.setLessonid(13L);
        long expResult = 13L;
        long result = instance.getLessonid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLessonid method, of class Lesson.
     */
    @Test
    public void testSetLessonid() {
        System.out.println("setLessonid");
        long lessonid = 0L;
        Lesson instance = new Lesson("Lesson", 6.66, new Teacher());
        instance.setLessonid(lessonid);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTitle method, of class Lesson.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Lesson instance = new Lesson();
        instance.setTitle("Sex Tourism");
        String expResult = "Sex Tourism";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTitle method, of class Lesson.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Lesson instance = new Lesson();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCrpoints method, of class Lesson.
     */
    @Test
    public void testGetCrpoints() {
        System.out.println("getCrpoints");
        Lesson instance = new Lesson();
        instance.setCrpoints(13.37);
        double expResult = 13.37;
        double result = instance.getCrpoints();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCrpoints method, of class Lesson.
     */
    @Test
    public void testSetCrpoints() {
        System.out.println("setCrpoints");
        double crpoints = 0.0;
        Lesson instance = new Lesson();
        instance.setCrpoints(crpoints);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCourse method, of class Lesson.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Lesson instance = new Lesson();
        Course expResult = null;
        Course result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCourse method, of class Lesson.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Course course = null;
        Lesson instance = new Lesson();
        instance.setCourse(course);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTeacher method, of class Lesson.
     */
    @Test
    public void testGetTeacher() {
        System.out.println("getTeacher");
        Lesson instance = new Lesson();
        Teacher expResult = null;
        Teacher result = instance.getTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDescription method, of class Lesson.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Lesson instance = new Lesson();
        instance.setDescription("We are Shaved Monkeys");
        String expResult = "We are Shaved Monkeys";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDescription method, of class Lesson.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Lesson instance = new Lesson();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTeacher method, of class Lesson.
     */
    @Test
    public void testSetTeacher() {
        System.out.println("setTeacher");
        Teacher teacher = null;
        Lesson instance = new Lesson();
        instance.setTeacher(teacher);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getGrades method, of class Lesson.
     */
    @Test
    public void testGetGrades() {
        System.out.println("getGrades");
        Lesson instance = new Lesson();
        List<Grade> expResult = null;
        List<Grade> result = instance.getGrades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setGrades method, of class Lesson.
     */
    @Test
    public void testSetGrades() {
        System.out.println("setGrades");
        List<Grade> grades = null;
        Lesson instance = new Lesson();
        instance.setGrades(grades);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
