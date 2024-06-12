package AddressBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        HandleFunction handleFunction = new HandleFunction();

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Please enter your choice: ");
            System.out.println("1. Add New Contract");
            System.out.println("2. Find Contract By Name");
            System.out.println("3. Display Contract");
            System.out.println("4. Exit ");
            System.out.println("---------------------------------------");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    handleFunction.Add();
                    break;
                case 2:
                    System.out.println("1");
                    break;
                case 3:
                    System.out.println("1");
                    break;
                case 4:
                    System.out.println("Exit");
                    System.out.println("Closing Program");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }

}
