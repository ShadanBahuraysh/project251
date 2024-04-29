
package project251;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TableReservationSystemTest {
    
    private TableReservationSystem reservation;
    private TableReservation[] reservations;

    public TableReservationSystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        reservation = new TableReservationSystem();
        reservations = new TableReservation[] {
            new TableReservation(1, "05/01/2024", 4, "19:00"),
            new TableReservation(2, "05/01/2024", 6, "20:00")  
        };
        
    }
    
    @After
    public void tearDown() {
        reservation = null;
        reservations = null;
    }

    
    @Test
    public void testMakeTableReservation_TableAvailable() {
    System.out.println("TableAvailable");
    String input = "4\n07/01/2024\n4\n19:00\n"; 
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    reservation.makeTableReservation(reservations);
    System.setIn(System.in);
    assertTrue(reservations[0].isAvailable());
}
    
    @Test
    public void testMakeTableReservation_TableNotAvailable() {
        System.out.println("TableNotAvailable");
        reservations[0].reserveTable();
        String input = "1\n05/01/2024\n4\n19:00\n"; 
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        reservation.makeTableReservation(reservations);
        System.setIn(System.in);
        assertFalse(reservations[0].isAvailable()); 
    }
}