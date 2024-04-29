package project251;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class order {
   
    private List<MenuItem> itemsOrdered;

    public order() {
        this.itemsOrdered = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        itemsOrdered.add(item);
    }

    public void displayOrder() {
        System.out.println("---------- Your Order ----------");
        for (MenuItem item : itemsOrdered) {
            displayMenuItem(item);
        }
    }
    
    public List<MenuItem> getOrderedItems() {
        return itemsOrdered;
    }
    
    private void displayMenuItem(MenuItem item) {
        System.out.println("- " + item.toString());
    }
    
    public static void makeOrder(Scanner input, Menu menu, order order) {
        boolean condition = false;
        String itemName = "";
        while (!condition) {
            System.out.print("Enter the item name to order: ");
            itemName = input.next();
            MenuItem orderedItem = menu.findMenuItemsByName(itemName);
            
            if (orderedItem != null) {
                order.addItem(orderedItem);
                System.out.println("Ordered: " + orderedItem.getName() + " - $" + orderedItem.getPrice());
                
                System.out.print("Is that all ?");
                String yesNo = input.next().toLowerCase();
                if (yesNo.equals("yes")) {
                    condition = true;
                    order.displayOrder();
                }
            } else {
                throw new IllegalArgumentException("Item not found in the menu!");
            }
        }
    }
    
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (MenuItem item : itemsOrdered) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
