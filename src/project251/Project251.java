
package project251;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    

public class Project251 extends Menu{
    
    public static void options() {
        System.out.println("\n\n******************");
        System.out.println("****** Restaurant Options *******");
        System.out.println("******************");
        System.out.println("1: View Menu Items");
        System.out.println("2: Order");
        System.out.println("3: Reserve Table");
        System.out.println("4: Make Payment");
        System.out.println("5: Exit");
        System.out.println(" ---------------------------------------------------");
        System.out.print("\nChoose from the menu: ");
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selectedOption;
        
        
      System.out.println("Welcome to the Restaurant!");
       Menu menu = new Menu();
       do {
            options();
            selectedOption = input.nextInt();

            if (selectedOption == 1) {
                menu.DisplayMenu();
            } else if (selectedOption == 2) {
                System.out.print("Enter the item name to order: ");
                String itemName = input.next();
            } else if (selectedOption == 3) {
                System.out.println("Table reserved!");
            } else if (selectedOption == 4) {
                System.out.println("Payment made!");
            } else if (selectedOption == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        } while (selectedOption != 5);
        
        input.close();
    }
}