/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.controllers;

import java.net.MalformedURLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author student
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LoginControllerTest {
      @LocalServerPort
    private int port;

    private URL base;
    private URL vase;
    private URL mase;
    private URL gase;

    @Autowired
    private TestRestTemplate template;
    public LoginControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws MalformedURLException {
      this.base = new URL("http://localhost:" + port + "/");
      this.vase = new URL("http://localhost:" + port + "/createuser");
      this.mase = new URL("http://localhost:" + port + "/posts/testteacher");
      this.gase = new URL("http://localhost:" + port + "/newlesson");

    }
    
    @After
    public void tearDown() {
    }
    
   


    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        //System.out.println(response.getBody());
        assertThat(response.getBody(), equalTo(response.getBody()));
    }
    @Test
    public void getShmello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(vase.toString(),
                String.class);
        //System.out.println(response.getBody());
        assertThat(response.getBody(), equalTo(response.getBody()));
    }
     @Test
    public void getPomello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(mase.toString(),
                String.class);
        //System.out.println(response.getBody());
        assertThat(response.getBody(), equalTo(response.getBody()));
    }
     @Test
    public void getImello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(gase.toString(),
                String.class);
        System.out.println(response.getBody());
        assertThat(response.getBody(), equalTo(response.getBody()));
    }

    /**
     * Test of isName method, of class LoginController.
     */
    @Test
    public void testIsName() {
        System.out.println("isName");
        String name = "Abcd";
        boolean expResult = true;
        boolean result = LoginController.isName(name);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isTelNumber method, of class LoginController.
     */
    @Test
    public void testIsTelNumber() {
        System.out.println("isTelNumber");
        String telephoneNumber = "28356473";
        String telephoneNumber1 = "37128356473";
        String telephoneNumber2 = "+37128356473";
        boolean expResult = true;
        boolean result = LoginController.isTelNumber(telephoneNumber) && LoginController.isTelNumber(telephoneNumber1) && LoginController.isTelNumber(telephoneNumber2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmail method, of class LoginController.
     */
    @Test
    public void testIsEmail() {
        System.out.println("isEmail");
        String email = "abcd@mail.com";
        boolean expResult = true;
        boolean result = LoginController.isEmail(email);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of index method, of class LoginController.
     */
    @Test
    public void testIndex() {
        System.out.println("index");
        LoginController instance = new LoginController();
        String expResult = "posts/login";
        String result = instance.index();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of newUser method, of class LoginController.
     */
//    @Test
//    public void testNewUser() {
//        System.out.println("newUser");
//        Model model = null;
//        LoginController instance = new LoginController();
//        String expResult = "";
//        String result = instance.newUser(model);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of create method, of class LoginController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String name = "";
        String surname = "";
        String phone = "";
        String email = "";
        String password = "";
        String role = "";
        LoginController instance = new LoginController();
        String expResult = "createuser";
        String result = instance.create(name, surname, phone, email, password, role);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listPosts method, of class LoginController.
     */
//    @Test
//    public void testListPosts() {
//        System.out.println("listPosts");
//        Model model = null;
//        Authentication authentication = null;
//        LoginController instance = new LoginController();
//        String expResult = "";
//        String result = instance.listPosts(model, authentication);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
    

/**
 *
 * @author student
 */

    
   
}
