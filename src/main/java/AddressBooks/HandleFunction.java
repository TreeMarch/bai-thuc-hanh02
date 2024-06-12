package AddressBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class HandleFunction {
    public void Add(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        System.out.println("Please enter contract information");
        System.out.println("Please enter the name of the contact you would like to add");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Please enter the company of the contact you would like to add");
        String company = sc.nextLine();
        sc.nextLine();
        System.out.println("Please enter the email of the contact you would like to add");
        String email = sc.nextLine();
        sc.nextLine();
        System.out.println("Please enter the phone number of the contact you would like to add");
        String phone = sc.nextLine();
        sc.nextLine();
        contacts.add(new Contact(name, company, email, phone));
        System.out.println(contacts);
        System.out.println("Congratulation,contact added successfully");

    };
    public void Display(){
        ArrayList<Contact> contacts = new ArrayList<>();
        for (Contact information : contacts) {
        }
        System.out.println("__________________________________________");
        if (contacts.isEmpty()) {
            System.out.println("No contacts found in AddressbookManager!");
        }
        
    };
    public void findPhoneNumber(){};
}
