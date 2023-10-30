package service;

import java.util.ArrayList;
import java.util.List;
import model.ConferenceRoom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationSystemTest {

    private ReservationSystem system;

    @BeforeEach
    public void setUp() {
        system = new ReservationSystem();
    }

    @Test
    public void testReserveRoomTrue() {
        assertEquals(true,system.reserveRoom("A1"));
        // Implementar pruebas aquí
    }
    @Test
    public void testReserveRoomFalseById() {
        assertEquals(false,system.reserveRoom("A3"));
        // Implementar pruebas aquí
    }
    @Test
    public void testReserveRoomFalseByIsReserved() {
        system.reserveRoom("A1");
        assertEquals(false,system.reserveRoom("A1"));
        // Implementar pruebas aquí
    }
     @Test
    public void testCancelReservationTrue() {
        
        system.reserveRoom("A1");
        assertEquals(true,system.cancelReservation("A1"));
        // Implementar pruebas aquí
    }
    @Test
     public void testCancelReservationFalseById() {
        assertEquals(false,system.cancelReservation("A3"));
        // Implementar pruebas aquí
    }
     @Test
     public void testCancelReservationFalseByIsReserved() {
        assertEquals(false,system.cancelReservation("A1"));
        // Implementar pruebas aquí
    }
    @Test
    public void testGetAvailableRooms(){
        assertEquals("A1",system.getAvailableRooms().get(0).getId());
    }
    // Puedes añadir más pruebas según lo consideres necesario
}
