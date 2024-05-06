/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


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
    public void testDisplayMenuWithCorrectItems() {
        System.out.println("testDisplayMenuWithCorrectItems");
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        instance.DisplayMenu();

        assertTrue(outputStreamCaptor.toString().contains("Chocolate_Cake"));
    }

    @Test
    public void testDisplayMenuWithInCorrectItem() {
        System.out.println("testDisplayMenuWithInCorrectItem");
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        instance.DisplayMenu();

        assertFalse(outputStreamCaptor.toString().contains("Ice_Cream"));
    }

    @Test
    public void testFindMenuItemsByName() {
        System.out.println("findMenuItemsByName");
        String itemName = "Caesar_Salad";

        MenuItem result = instance.findMenuItemsByName(itemName);
        assertEquals(itemName, result.getName());


    }

    @Test
    public void testFindMenuItemsByNameNotExist() {
        System.out.println("findMenuItemsByNameNotExist");
        String itemName = "Meat_soup";

        MenuItem result = instance.findMenuItemsByName(itemName);
        assertNotEquals(itemName, result);

    }

}
