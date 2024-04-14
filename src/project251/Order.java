package project251;
import java.util.List;
import java.util.ArrayList;

public class Order {
    
private List<MenuItem> itemsOrdered;

    public Order() {
        this.itemsOrdered = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        itemsOrdered.add(item);
    }

    public void displayOrder() {
        System.out.println("---------- Your Order ----------");
        for (MenuItem item : itemsOrdered) {
            System.out.println("- " + item.getName() + " $" + item.getPrice() + " - " + item.getDescription());
        }
    }
}