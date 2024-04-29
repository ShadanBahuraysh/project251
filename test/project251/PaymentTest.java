package project251;

import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {

    @Test
  
public void testMakePayment_EnoughPayment() {
    // Create a mock order with known items and prices
    order order = new order();
    MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
    MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 15.00);
    order.addItem(item1);
    order.addItem(item2);

    // Assume payment amount is sufficient
    double paymentAmount = 34.70; // Total amount including tax

    // Call the makePayment method and capture the change
    double change = Payment.makePayment(order, paymentAmount);

    // Calculate expected change
    double expectedChange = paymentAmount - (order.calculateTotalPrice() + order.calculateTotalPrice() * Payment.getTaxRate());

    // Assertion: Change should not be NaN (payment amount is sufficient)
    assertFalse("Payment should succeed for sufficient payment", Double.isNaN(change));
}

    
    @Test
    public void testMakePayment_InsufficientPayment() {
        // Create a mock order with known items and prices
        order order = new order();
        MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
        MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 15.00);
        order.addItem(item1);
        order.addItem(item2);

        // Assume payment amount is insufficient
        double paymentAmount = 20.00; // Less than total amount including tax

        // Call the makePayment method and capture the change
        double change = Payment.makePayment(order, paymentAmount);

        // Assertion: Change should be NaN (payment amount is less than total)
        assertTrue("Change should be NaN for insufficient payment", Double.isNaN(change));
    }
    
    
}
