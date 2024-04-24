
package project251;
import java.util.Scanner;

public class Project251{

    public static void option() {
        System.out.println("\n");
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

        System.out.println("Welcome to Central Restaurant!");
        Menu menu = new Menu();
        Order order = new Order();
        TableReservationSystem  reservation = new TableReservationSystem();
            TableReservation[] reservations = {
            new TableReservation(1, "05/13/2024", 4, "18:00"),
            new TableReservation(2, "06/14/2024", 6, "19:00"),};        
        do {
            option();
            selectedOption = input.nextInt();

            if (selectedOption == 1) {
                menu.DisplayMenu();
            } else if (selectedOption == 2) {
                order.makeOrder(input, menu, order);
            } else if (selectedOption == 3) {
                reservation.makeTableReservation(reservations);
            } else if (selectedOption == 4) {
                Payment.makePayment(order);
            } else if (selectedOption == 5) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        } while (selectedOption != 5);

        input.close();
    }

}