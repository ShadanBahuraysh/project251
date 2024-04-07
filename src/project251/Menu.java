
package project251;
import java.util.ArrayList;

class MenuItem {
    private String name;
    private String description;
    private double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Chicken Biryani", "Delicious chicken and rice dish.", 12.99));
        menuItems.add(new MenuItem("Veg Pizza", "Vegetarian pizza with assorted toppings.", 8.99));
        menuItems.add(new MenuItem("Grilled Salmon", "Grilled salmon served with vegetables.", 16.99));  
    }

    public void DisplayMenu() {
        for (MenuItem item : menuItems) {
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Price: $" + item.getPrice());
            System.out.println();
        }
    }
   
    
}

       
        
    