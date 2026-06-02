package com.pams.PAMSApp;

import java.util.Scanner;

import com.pams.service.PatientService;

public class PAMSApp {
    public static void main(String[] args) {
        PatientService service = PatientService.getPatientService();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n=== Patient Menu ===");
            System.out.println("1. List All Patients (JSON Long)");
            System.out.println("2. List Patients By Age");
            System.out.println("3. Find Patient By ID");
            System.out.println("4. Find Patient By Name");
            System.out.println("5. Exit");
            System.out.print("Select option: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println(service.PatientsToJSONLong());
                    break;

                case "2":
                    System.out.println(service.PatientsByAgeLong());
                    break;

                case "3":
                    System.out.print("Enter patient ID: ");

                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println(service.getPatientById(id));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }
                    break;

                case "4":
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.println(service.getPatientByName(name));
                    break;

                case "5":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
