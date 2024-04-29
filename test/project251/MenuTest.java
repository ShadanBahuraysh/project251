/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reaho
 */
public class MenuTest {
    public Menu instance;
    public MenuTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Menu();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of DisplayMenu method, of class Menu.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("DisplayMenu");

        
        String[] expectedMenu = {
            "---------- Menu ----------",
            "Appetizers:",
            "- Caesar_Salad $12.0 - Fresh romaine lettuce with Caesar dressing",
            "- Mozzarella_Sticks $12.0 - Fried mozzarella cheese sticks served with marinara sauce",
            "Main Courses:",
            "- Grilled_Salmon $12.0 - Grilled Atlantic salmon fillet with lemon butter sauce",
            "- Chicken_Alfredo $12.0 - Grilled chicken breast with creamy Alfredo sauce and fettuccine pasta",
            "Desserts:",
            "- Chocolate_Cake $6.0 - Decadent chocolate cake with chocolate frosting",
            "- Cheesecake $6.0 - Classic New York style cheesecake with strawberry topping"
        };        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));     
        instance.DisplayMenu();        
        String[] actualMenu = outContent.toString().trim().split("\\r?\\n");        
        assertArrayEquals(expectedMenu, actualMenu);
    }
    
    
    @Test
    public void testDisplayMenu_CorrectCategories() {
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));        
        instance.DisplayMenu();        
        String actualOutput = outContent.toString();               
        assertTrue(actualOutput.contains("Main Courses:"));
        
    }
    
    @Test
    public void testDisplayMenu_inCorrectCategories() {
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));        
        instance.DisplayMenu();        
        String actualOutput = outContent.toString();               
        assertFalse(actualOutput.contains("Drinks"));
        
    }

   
    
    
    
}
