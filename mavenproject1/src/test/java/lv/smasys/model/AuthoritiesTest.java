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
public class AuthoritiesTest {
    
    public AuthoritiesTest() {
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
     * Test of getUsername method, of class Authorities.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Authorities instance = new Authorities();
        instance.setUsername("5_minut_nazad");
        String expResult = "5_minut_nazad";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setUsername method, of class Authorities.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Authorities instance = new Authorities();
        Authorities shmest = new Authorities("ubej","menja");
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getAuthority method, of class Authorities.
     */
    @Test
    public void testGetAuthority() {
        System.out.println("getAuthority");
        Authorities instance = new Authorities();
        instance.setAuthority("Immagod");
        String expResult = "Immagod";
        String result = instance.getAuthority();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setAuthority method, of class Authorities.
     */
    @Test
    public void testSetAuthority() {
        System.out.println("setAuthority");
        String authority = "";
        Authorities instance = new Authorities();
        instance.setAuthority(authority);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
