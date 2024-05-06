package project251;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class PaymentTest {
    
    public  PaymentTest() {
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

  @Test
   public void testMakePayment_EnoughPayment() {
    System.out.println("testMakePayment_EnoughPayment");
    order order = new order();
    MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
    MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 15.00);
    order.addItem(item1);
    order.addItem(item2);

    double paymentAmount = 34.70; // Total amount including tax

    double change = Payment.makePayment(order, paymentAmount);

    double expectedChange = paymentAmount - (order.calculateTotalPrice() + order.calculateTotalPrice() * Payment.getTaxRate());

    assertFalse( Double.isNaN(change));
}

    
    @Test
    public void testMakePayment_InsufficientPayment() {
        System.out.println("testMakePayment_InsufficientPayment");
        order order = new order();
        MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
        MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 15.00);
        order.addItem(item1);
        order.addItem(item2);

        double paymentAmount = 20.00; 

        double change = Payment.makePayment(order, paymentAmount);

        assertTrue(Double.isNaN(change));
    }
    
    @Test
    public void testCalculateSubtotal() {
        System.out.println("testCalculateSubtotal");
        order order = new order();
        order.addItem(new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00));
        order.addItem(new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 15.00));

        double expectedSubtotal = 27.00; // Expected subtotal is 12.00 + 15.00 = 27.00
        double actualSubtotal = Payment.calculateSubtotal(order);
        assertEquals(expectedSubtotal, actualSubtotal, 0.001);
    }

    @Test
    public void testCalculateTax() {
        System.out.println("testCalculateTax");
        double subtotal = 50.0;

        double expectedTax = 5.0; // 10% of 50.0
        double actualTax = Payment.calculateTax(subtotal);
        assertEquals(expectedTax, actualTax, 0.001);
    }
}