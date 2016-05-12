/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webcalculator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author john.arcy.r.teodoro
 */
public class CalculatorServletTest {
    
    
    public CalculatorServletTest() {
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
     * Test of processRequest method, of class CalculatorServlet.
     */
    
    /**
    @org.junit.Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CalculatorServlet instance = new CalculatorServlet();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    /**
     * Test of doGet method, of class CalculatorServlet.
     */
    
    /**
    @org.junit.Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CalculatorServlet instance = new CalculatorServlet();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    /**
     * Test of doPost method, of class CalculatorServlet.
     */
    
    /**
    @org.junit.Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CalculatorServlet instance = new CalculatorServlet();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    /**
     * Test of getServletInfo method, of class CalculatorServlet.
     */
    
    /**
    @org.junit.Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        CalculatorServlet instance = new CalculatorServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    /**
     * Test of Addition method, of class CalculatorServlet.
     */
    @org.junit.Test
    public void testAddition() {
        System.out.println("Addition");
        String num1 = "3";
        String num2 = "2";
        CalculatorServlet instance = new CalculatorServlet();
        String expResult = "5.0";
        String result = instance.Addition(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Subtraction method, of class CalculatorServlet.
     */
    @org.junit.Test
    public void testSubtraction() {
        System.out.println("Subtraction");
        String num1 = "3";
        String num2 = "2";
        CalculatorServlet instance = new CalculatorServlet();
        String expResult = "1.0";
        String result = instance.Subtraction(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplication method, of class CalculatorServlet.
     */
    @org.junit.Test
    public void testMultiplication() {
        System.out.println("Multiplication");
        String num1 = "3";
        String num2 = "2";
        CalculatorServlet instance = new CalculatorServlet();
        String expResult = "6.0";
        String result = instance.Multiplication(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Division method, of class CalculatorServlet.
     */
    @org.junit.Test
    public void testDivision() {
        System.out.println("Division");
        String num1 = "3";
        String num2 = "2";
        CalculatorServlet instance = new CalculatorServlet();
        String expResult = "1.5";
        String result = instance.Division(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
