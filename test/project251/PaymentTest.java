package project251;

import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {

    @Test
    public void testMakePayment_EnoughPayment() {
        order order = new order();
        MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
        MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 15.00);
        order.addItem(item1);
        order.addItem(item2);

        double paymentAmount = 34.70;


        double change = Payment.makePayment(order, paymentAmount);

        assertEquals("Change calculation is incorrect", 5.00, change, 0.01);
    }

    @Test
    public void testMakePayment_InsufficientPayment() {

        order order = new order();
        MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
        MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 15.00);
        order.addItem(item1);
        order.addItem(item2);

        double paymentAmount = 20.00;


        double change = Payment.makePayment(order, paymentAmount);

        assertEquals("Change calculation is incorrect", Double.NaN, change, 0.01);
    }

    @Test
    public void testMakePayment_ZeroPayment() {
        order order = new order();
        MenuItem item1 = new MenuItem("Caesar_Salad", "Fresh romaine lettuce with Caesar dressing", 12.00);
        MenuItem item2 = new MenuItem("Grilled_Salmon", "Grilled Atlantic salmon fillet with lemon butter sauce", 15.00);
        order.addItem(item1);
        order.addItem(item2);

        double paymentAmount = 0.00;


        double change = Payment.makePayment(order, paymentAmount);

        assertEquals("Change calculation is incorrect", Double.NaN, change, 0.01);
    }
}
