/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.techfiree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0689497
 */
public class CSD4464Assignment1TechFirEETest {
    
    public CSD4464Assignment1TechFirEETest() {
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
     * Test of main method, of class CSD4464Assignment1TechFirEE.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CSD4464Assignment1TechFirEE.main(args);
       
    }

    /**
     * Test of stringPower method, of class CSD4464Assignment1TechFirEE.
     */
    @Test
    public void testStringPower() {
        System.out.println("stringPower");
        String sample = "";
        int i = 0;
        String expResult = "";
        String result = CSD4464Assignment1TechFirEE.stringPower(sample, i);
        assertEquals(expResult, result);
        
      
    }
    
    @Test
   public void testEmptyStringShouldReturnEmptyString(){
        String sample = "";
        int i = 0;
        String result = CSD4464Assignment1TechFirEE.stringPower(sample, i);
        String expResult = "";
        assertEquals(expResult, result);
       
   }
   @Test
     public void testLessThanOneShouldReturnNull()
     {
        String sample = null;
        int i = 0;
        String result = CSD4464Assignment1TechFirEE.stringPower(sample, i);
        String expResult = null;
        assertEquals(expResult, result);
       
     }
     @Test
     public void testStringAndOneShouldReturnString()
     {
        String sample = "Heloo! World";
        int i = 1;
        String result = CSD4464Assignment1TechFirEE.stringPower(sample, i);
        String expResult = "Heloo! World";
        assertEquals(expResult, result);
       
     
     }
     @Test
     public void testStringAndTwoShouldReturnStringDoubled(){
        String sample = "Hello";
        int i = 2;
        String result = CSD4464Assignment1TechFirEE.stringPower(sample, i);
        String expResult = "HelloHello";
        assertEquals(expResult, result);
       
     }
}
