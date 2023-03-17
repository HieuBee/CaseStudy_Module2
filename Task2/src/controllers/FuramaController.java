package controllers;

import models.Employee;
import services.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        int select;
        do {
            System.out.println("~~~~~~~~~ Menu ~~~~~~~~");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Please input number: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    int selectOption = 0;
                    do {
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        selectOption = sc.nextInt();
                        switch (selectOption){
                            case 1:
                                EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
                                employeeService.displayEmployee();
                                break;
                            case 2:
                                System.out.println("Case 2");
                                EmployeeServiceImpl employeeService1 = new EmployeeServiceImpl();
                                System.out.println("Input id: ");
                                int newId = Integer.parseInt(sc.nextLine());
                                break;
                            case 3:
                                System.out.println("Case 3");
                                break;
                            case 4:
                                System.out.println("Case 4");
                                break;
                        }
                    } while (selectOption < 5);
                    break;
                case 2:
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
                    break;
                case 3:
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Display list facility maintenance");
                    System.out.println("4. Return main menu");
                    break;
                case 4:
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new constracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    break;
                case 5:
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    break;
                case 6:
                    System.exit(6);
            }
        }while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
