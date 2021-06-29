package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        Service service = new Service();
        service.createContact();
        service.showContact();
        service.editContact();
        service.showContact();
    }
}
