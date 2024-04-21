
package project251;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

    

public class Project251 extends Menu{
    
    public static void option() {
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
    
     public static boolean isTableAvailable(int tableNumber) { // to check table
   
                    return true;
     }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selectedOption;
        
        
      System.out.println("Welcome to the Restaurant!");
       Menu menu = new Menu();
       Order order = new Order();
       do {
            option();
            selectedOption = input.nextInt();

            if (selectedOption == 1) {
                menu.DisplayMenu();
            } else if (selectedOption == 2) {
                Order.handleOrder(input, menu, order);
            } else if (selectedOption == 3) {
                System.out.print("Enter the table number: ");
                int tableNumber = input.nextInt();
                System.out.print("Enter the date (MM/DD/YYYY): ");
                String date = input.next();
                System.out.print("Enter the number of people: ");
                int numberOfPeople = input.nextInt();
                System.out.print("Enter the reservation time: ");
                String reservationTime = input.next();
               
                TableReservation reservation = new TableReservation(tableNumber, date, numberOfPeople, reservationTime);
                                                
                if (isTableAvailable(tableNumber)) {
                   
                  reservation.reserveTable();
                  System.out.println("Table " + tableNumber + " reserved for " + numberOfPeople + " people at " + reservationTime);
                  System.out.println("Table reserved!");
                } else {
                  System.out.println("Table " + tableNumber + " is not available for the given date and time.");
                } 
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