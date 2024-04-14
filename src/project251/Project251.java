
package project251;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

    

public class Project251 extends Menu{
    
    public static void menu() {
        System.out.println("\n\n**");
        System.out.println("****** Restaurant Options *******");
        System.out.println("");
        System.out.println("1: View Menu Items");
        System.out.println("2: Order");
        System.out.println("3: Reserve Table");
        System.out.println("4: Make Payment");
        System.out.println("5: Exit");
        System.out.println(" ---------------------------------------------------");
        System.out.print("\nChoose from the Options: ");
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selectedOption;
        
        
      System.out.println("Welcome to the Restaurant!");
       Menu menu = new Menu();
       Order order = new Order();
       do {
            menu();
            selectedOption = input.nextInt();

            if (selectedOption == 1) {
                menu.DisplayMenu();
            } else if (selectedOption == 2) {
                Boolean condition= false;
                String itemName="";
                while(condition==false){
                System.out.print("Enter the item name to order: ");
                itemName= input.next();
                MenuItem ordereditems = menu.findItemByName(itemName);
                if (ordereditems != null) {
                    order.addItem(ordereditems);
                    System.out.println("Ordered: " + ordereditems.getName() + " - $" + ordereditems.getPrice());
                    System.out.print("Is that all ?");
                    String YesNo=input.next().toLowerCase();
                    if(YesNo.equals("no")){
                    condition=false;
                    }
                    else if(YesNo.equals("yes")){
                    condition=true; 
                    order.displayOrder();
                    }
                } else {
                    System.out.println("Item not found in the menu!");
                }
                }
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