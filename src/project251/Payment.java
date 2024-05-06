package project251;

import java.util.List;

public class Payment {
    
    

    static final double TAX_RATE = 0.1; // 10% tax rate

    public static double getTaxRate() {
        return TAX_RATE;
    }

    public static double makePayment(order order, double paymentAmount) {
        double subtotal = calculateSubtotal(order);
        double tax = calculateTax(subtotal);
        double total = subtotal + tax;

        if (paymentAmount >= total) {
            double change = paymentAmount - total;
            System.out.println("Payment successful! Change: $" + String.format("%.2f", change));
            return change;
        } else {
            System.out.println("Insufficient payment amount. Payment failed.");
            return Double.NaN; // Return NaN for insufficient payment
        }
    }

    static double calculateSubtotal(order order) {
        double subtotal = 0.0;
        List<MenuItem> orderedItems = order.getOrderedItems();
        for (MenuItem item : orderedItems) {
            subtotal += item.getPrice();
        }
        return subtotal;
    }

    static double calculateTax(double subtotal) {
        return subtotal * TAX_RATE;
    }
}
