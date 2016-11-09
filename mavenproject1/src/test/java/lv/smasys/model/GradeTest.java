/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.model;

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
public class GradeTest {
    
    public GradeTest() {
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
     * Test of getGrade method, of class Grade.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Grade instance = new Grade();
        instance.setGrade(6.6);
        double expResult = 6.6;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setGrade method, of class Grade.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 0.0;
        Grade instance = new Grade(13.37, "monkey");
        instance.setGrade(grade);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getGradedate method, of class Grade.
     */
    @Test
    public void testGetGradedate() {
        System.out.println("getGradedate");
        Grade instance = new Grade();
        instance.setGradedate("21.12.12");
        String expResult = "21.12.12";
        String result = instance.getGradedate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setGradedate method, of class Grade.
     */
    @Test
    public void testSetGradedate() {
        System.out.println("setGradedate");
        String gradedate = "";
        Grade instance = new Grade();
        instance.setGradeid(10l);
        instance.getGradeid();
        instance.setGradedate(gradedate);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getStudent method, of class Grade.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        Grade instance = new Grade();
        Student expResult = null;
        Student result = instance.getStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setStudent method, of class Grade.
     */
    @Test
    public void testSetStudent() {
        System.out.println("setStudent");
        Student student = null;
        Grade instance = new Grade();
        instance.setStudent(student);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLesson method, of class Grade.
     */
    @Test
    public void testGetLesson() {
        System.out.println("getLesson");
        Grade instance = new Grade();
        Lesson expResult = null;
        Lesson result = instance.getLesson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLesson method, of class Grade.
     */
    @Test
    public void testSetLesson() {
        System.out.println("setLesson");
        Lesson lesson = null;
        Grade instance = new Grade();
        instance.setLesson(lesson);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
