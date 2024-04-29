package project251;

import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {

    @Test
  
public void testMakePayment_EnoughPayment() {
    order order = new order();
    MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
    MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 12.00);
    order.addItem(item1);
    order.addItem(item2);

    double paymentAmount = 34.70; // Total amount including tax

    double change = Payment.makePayment(order, paymentAmount);

    double expectedChange = paymentAmount - (order.calculateTotalPrice() + order.calculateTotalPrice() * Payment.getTaxRate());

    assertFalse("Payment should succeed for sufficient payment", Double.isNaN(change));
}

    
    @Test
    public void testMakePayment_InsufficientPayment() {
        order order = new order();
        MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
        MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 12.00);
        order.addItem(item1);
        order.addItem(item2);

        double paymentAmount = 20.00; 

        double change = Payment.makePayment(order, paymentAmount);

        assertTrue("Change should be NaN for insufficient payment", Double.isNaN(change));
    }
    
    
}
