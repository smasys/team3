/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.controllers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.Authentication;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author student
 */
public class PostControllerTest {
    
    public PostControllerTest() {
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
     * Test of delete method, of class PostController.
     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        long id = 0L;
//        PostController instance = new PostController();
//        ModelAndView expResult = null;
//        ModelAndView result = instance.delete(id);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of newProject method, of class PostController.
     */
    @Test
    public void testNewProject() {
        System.out.println("newProject");
        PostController instance = new PostController();
        String expResult = "posts/new";
        String result = instance.newProject();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of create method, of class PostController.
//     */
//    @Test
//    public void testCreate() {
//        System.out.println("create");
//        String comment = "";
//        PostController instance = new PostController();
//        ModelAndView expResult = null;
//        ModelAndView result = instance.create(comment);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of update method, of class PostController.
//     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        long id = 0L;
//        String message = "";
//        PostController instance = new PostController();
//        ModelAndView expResult = null;
//        ModelAndView result = instance.update(id, message);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of edit method, of class PostController.
//     */
//    @Test
//    public void testEdit() {
//        System.out.println("edit");
//        long id = 1L;
//        Model model = null;
//        PostController instance = new PostController();
//        String expResult = "posts/edit";
//        String result = instance.edit(id, model);
//        assertEquals(expResult, result);
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of userInfo method, of class PostController.
//     */
//    @Test
//    public void testUserInfo() {
//        System.out.println("userInfo");
//        Authentication authentication = null;
//        PostController instance = new PostController();
//        String expResult = "";
//        String result = instance.userInfo(authentication);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
    
}
