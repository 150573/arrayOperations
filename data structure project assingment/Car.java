/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.time.LocalDateTime;

public class Car {
    private String licensePlate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.entryTime = LocalDateTime.now();
        this.exitTime = null; // Initialize exit time as null (not yet exited)
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime() {
        this.exitTime = LocalDateTime.now();
    }
}