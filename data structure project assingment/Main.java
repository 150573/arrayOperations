/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author HP
 */
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array for storing car records
        Car[] carArray = new Car[10];
        int arrayIndex = 0;

        // LinkedList for storing car records
        LinkedList<Car> carLinkedList = new LinkedList<>();

        // Stack for storing car records
        Stack<Car> carStack = new Stack<>();

        // Queue for storing car records
        Queue<Car> carQueue = new LinkedList<>();

        while (true) {
            System.out.println("Enter license plate number (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            Car car = new Car(input);

            // Record car entering (add to all data structures)
            if (arrayIndex < carArray.length) {
                carArray[arrayIndex++] = car;
            } else {
                System.out.println("Array is full, can't add more cars.");
            }
            carLinkedList.add(car);
            carStack.push(car);
            carQueue.add(car);

            System.out.println("Car with license plate " + car.getLicensePlate() + " has entered.");

            // Simulate car leaving
            simulateCarLeaving(car);
        }

        // Display cars in array
        System.out.println("\nCars in Array:");
        displayCars(carArray, arrayIndex);

        // Display cars in linked list
        System.out.println("\nCars in LinkedList:");
        displayCars(carLinkedList);

        // Display cars in stack
        System.out.println("\nCars in Stack:");
        displayCars(carStack);

        // Display cars in queue
        System.out.println("\nCars in Queue:");
        displayCars(carQueue);

        scanner.close();
    }

    // Helper method to simulate car leaving
    private static void simulateCarLeaving(Car car) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Car with license plate " + car.getLicensePlate() + " is leaving. Enter 'leave' to record exit:");
        String leaveInput = scanner.nextLine();

        if (leaveInput.equalsIgnoreCase("leave")) {
            car.setExitTime();
            System.out.println("Car with license plate " + car.getLicensePlate() + " has left at " + car.getExitTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        } else {
            System.out.println("Invalid input. Car exit not recorded.");
        }
    }

    // Helper method to display cars in array
    private static void displayCars(Car[] cars, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("License Plate: " + cars[i].getLicensePlate() + ", Entry Time: " + cars[i].getEntryTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                    (cars[i].getExitTime() != null ? ", Exit Time: " + cars[i].getExitTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) : ""));
        }
    }

    // Helper method to display cars in linked list, stack, and queue
    private static void displayCars(Collection<Car> cars) {
        for (Car car : cars) {
            System.out.println("License Plate: " + car.getLicensePlate() + ", Entry Time: " + car.getEntryTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                    (car.getExitTime() != null ? ", Exit Time: " + car.getExitTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) : ""));
        }
    }
}