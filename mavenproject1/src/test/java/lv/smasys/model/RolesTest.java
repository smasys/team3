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
public class RolesTest {
    
    public RolesTest() {
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
     * Test of getName method, of class Roles.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Roles instance = new Roles("name");
       
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setName method, of class Roles.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Roles instance = new Roles("name");
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
