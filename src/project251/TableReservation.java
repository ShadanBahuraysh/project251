package project251;
import java.util.Scanner;

public class TableReservation {

    private int tableNumber;
    private String date;
    private int numberOfPeople;
    private String reservationTime;
    private boolean status; // 
    

    public TableReservation(int tableNumber, String date, int numberOfPeople, String reservationTime) {
        this.tableNumber = tableNumber;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.reservationTime = reservationTime;
    }


    public int getTableNumber() {
        return tableNumber;
    }

    public String getDate() {
        return date;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public boolean isAvailable() {
        return !status;
    }

    public void reserveTable() {
        this.status = true;
    }

    public void cancelReservation() {
        status = false;
       
    }
}
    
    
