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
public class TeacherTest {
    
    public TeacherTest() {
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
     * Test of getTeacherid method, of class Teacher.
     */
    @Test
    public void testGetTeacherid() {
        System.out.println("getTeacherid");
        Teacher instance = new Teacher();
        instance.setTeacherid(10l);
        Long expResult = 10l;
        Long result = instance.getTeacherid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTeacherid method, of class Teacher.
     */
    @Test
    public void testSetTeacherid() {
        System.out.println("setTeacherid");
        Long teacherid = null;
        Teacher instance = new Teacher();
        instance.setTeacherid(teacherid);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFirstname method, of class Teacher.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Teacher instance = new Teacher();
        instance.setFirstname("Marja");
        String expResult = "Marja";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFirstname method, of class Teacher.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        Teacher instance = new Teacher();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLastname method, of class Teacher.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Teacher instance = new Teacher();
        instance.setLastname("Ivanovna");
        String expResult = "Ivanovna";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLessons method, of class Teacher.
     */
    @Test
    public void testGetLessons() {
        System.out.println("getLessons");
        Teacher instance = new Teacher();
        List<Lesson> expResult = null;
        List<Lesson> result = instance.getLessons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCourses method, of class Teacher.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        Teacher instance = new Teacher();
        List<Course> expResult = null;
        List<Course> result = instance.getCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCourses method, of class Teacher.
     */
    @Test
    public void testSetCourses() {
        System.out.println("setCourses");
        List<Course> courses = null;
        Teacher instance = new Teacher();
        instance.setCourses(courses);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLessons method, of class Teacher.
     */
    @Test
    public void testSetLessons() {
        System.out.println("setLessons");
        List<Lesson> lessons = null;
        Teacher instance = new Teacher();
        instance.setLessons(lessons);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLastname method, of class Teacher.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        Teacher instance = new Teacher();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPhone method, of class Teacher.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Teacher instance = new Teacher();
        instance.setPhone("12345678");
        String expResult = "12345678";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPhone method, of class Teacher.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Teacher instance = new Teacher();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMail method, of class Teacher.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Teacher instance = new Teacher();
        instance.setMail("teacher@teaching.rox");
        String expResult = "teacher@teaching.rox";
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMail method, of class Teacher.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        Teacher instance = new Teacher();
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassword method, of class Teacher.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Teacher instance = new Teacher();
        instance.setPassword("Vova_Durak!");
        String expResult = "Vova_Durak!";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPassword method, of class Teacher.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Teacher instance = new Teacher();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
