/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadorajunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CalculadoraJUnitTest {
    
    public CalculadoraJUnitTest() {
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
     * Test of suma method, of class CalculadoraJUnit.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 2;
        int b = 3;
        CalculadoraJUnit instance = new CalculadoraJUnit();
        int expResult = 5;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of resta method, of class CalculadoraJUnit.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 1;
        int b = 1;
        CalculadoraJUnit instance = new CalculadoraJUnit();
        int expResult = 0;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of diiv method, of class CalculadoraJUnit.
     * @throws java.lang.Exception
     */
    @Test
    public void testDiiv() throws Exception {
        System.out.println("diiv");
        int a = 1;
        int b = 0;
        CalculadoraJUnit instance = new CalculadoraJUnit();
        int expResult = 0;
        int result = instance.diiv(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }   
}