/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;
import java.util.Scanner;

public class Payment {

    private static final double TAX_RATE = 0.1; // 10% tax rate

    public static void makePayment(order order) {
        double subtotal = calculate_Subtotal(order);
        double tax = calculate_Tax(subtotal);
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter payment amount: $");
        double paymentAmount = input.nextDouble();

        if (paymentAmount >= total) {
            double change = paymentAmount - total;
            System.out.println("Payment successful! Change: $" + String.format("%.2f", change));
        } else {
            System.out.println("Insufficient payment amount. Payment failed.");
        }
    }

    private static double calculate_Subtotal(order order) {
        double subtotal = 0.0;
        for (MenuItem item : order.getOrderedItems()) {
            subtotal += item.getPrice();
        }
        return subtotal;
    }

    private static double calculate_Tax(double subtotal) {
        return subtotal * TAX_RATE;
    }
}