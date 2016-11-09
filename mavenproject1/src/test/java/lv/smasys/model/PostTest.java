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
public class PostTest {
    
    public PostTest() {
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
     * Test of getId method, of class Post.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Post instance = new Post();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getMessage method, of class Post.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Post instance = new Post();
        instance.setMessage("Trump Wins!");
        String expResult = "Trump Wins!";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setMessage method, of class Post.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        Post instance = new Post("Message in a bottle");
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
