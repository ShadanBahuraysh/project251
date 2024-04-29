package project251;

import java.util.List;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;

public class orderTest {

    order orderTest;

    @Before
    public void setUp() {
        orderTest = new order();
    }

    @Test
    public void testAddItem() {
        // Create an order and add an item
        orderTest = new order();
        MenuItem item = new MenuItem("Burger", "Juicy beef patty with cheese and lettuce", 5.99);
        orderTest.addItem(item);

        // Check if the item was added successfully
        assertEquals(1, orderTest.getOrderedItems().size());
    }

    @Test
    public void testDisplayOrder() {
        // Redirect System.out to capture output
        ByteArrayInputStream in = new ByteArrayInputStream("yes".getBytes());
        System.setIn(in);

        // Create an order and add some items
        orderTest = new order();
        Menu menu = new Menu(); // Menu with default items
        MenuItem item1 = menu.findMenuItemsByName("Caesar_Salad");
        MenuItem item2 = menu.findMenuItemsByName("Grilled_Salmon");
        orderTest.addItem(item1);
        orderTest.addItem(item2);

        // Display the order and capture output
        orderTest.displayOrder();
    }

    @Test
    public void testMakeOrder() {
        // Prepare menu with some items
        Menu menu = new Menu();
        menu.DisplayMenu(); // Display menu for reference

        // Redirect System.in to provide input
        ByteArrayInputStream in = new ByteArrayInputStream("Caesar_Salad yes".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        // Make an order and check if the item was added
        orderTest = new order();
        orderTest.makeOrder(scanner, menu, orderTest);

        assertEquals(1, orderTest.getOrderedItems().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMakeOrderItemNotFound() {
        // Prepare menu with some items
        Menu menu = new Menu();
        menu.DisplayMenu(); // Display menu 

        // Redirect System.in to provide input for non-existing item
        ByteArrayInputStream in = new ByteArrayInputStream("Burger yes".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        // Make an order and expect an exception
        orderTest = new order();
        orderTest.makeOrder(scanner, menu, orderTest);

    }

}
