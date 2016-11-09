/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.model;

import java.util.ArrayList;
import java.util.List;
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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getStudentid method, of class Student.
     */
    @Test
    public void testGetStudentid() {
        System.out.println("getStudentid");
        Student instance = new Student();
        Long expResult = null;
        Long result = instance.getStudentid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setStudentid method, of class Student.
     */
    @Test
    public void testSetStudentid() {
        System.out.println("setStudentid");
        Long studentid = null;
        Student instance = new Student();
        instance.setStudentid(studentid);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFirstname method, of class Student.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Student instance = new Student();
        String expResult = "";
        instance.setFirstname(expResult);
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFirstname method, of class Student.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        Student instance = new Student();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLastname method, of class Student.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Student instance = new Student();
        String expResult = "";
        instance.setLastname(expResult);
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLastname method, of class Student.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        Student instance = new Student();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPhone method, of class Student.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Student instance = new Student();
        String expResult = "";
        instance.setPhone(expResult);
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPhone method, of class Student.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Student instance = new Student();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMail method, of class Student.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Student instance = new Student();
        String expResult = "";
        instance.setMail(expResult);
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMail method, of class Student.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Student instance = new Student();
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassword method, of class Student.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Student instance = new Student();
        String expResult = "";
        instance.setPassword("");
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPassword method, of class Student.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Student instance = new Student();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getGrade method, of class Student.
     */
  

    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Student instance = new Student();
        Course expResult = null;
        Course result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCourse method, of class Student.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Course course = null;
        Student instance = new Student();
        instance.setCourse(course);
        instance.setGrades(new ArrayList<Grade>());
        instance.getGrades();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
