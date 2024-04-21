package project251;


public class TableReservation {
    private int tableNumber;
    private String date;
    private int numberOfPeople;
    private String reservationTime;
    private boolean status; // true if reserved, false if available

    public TableReservation(int tableNumber, String date, int numberOfPeople, String reservationTime) {
        this.tableNumber = tableNumber;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.reservationTime = reservationTime;
        this.status = false; // By default, the table is available when created
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
        status = true;
    }

    public void cancelReservation() {
        status = false;
    }
    
    
}