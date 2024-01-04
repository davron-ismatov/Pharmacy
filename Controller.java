package Pharmacy;

import Pharmacy.Services.PharmacyService;

import java.util.Scanner;

public class Controller {
    static final String login = "user123";
    static final String password = "12345678";
    static Scanner scanner = new Scanner(System.in);
    static PharmacyService service = new PharmacyService();


    public static void main(String[] args) {
        System.out.print("Login: ");
        if (scanner.next().equals("user123")){
            System.out.print("Password: ");
            if (scanner.next().equals("12345678")){
                System.out.println("1.Search Pharmacy\n2.Add Pharmacy\n3.Deduct Pharmacy");
            }
        }else{
            System.err.println("Invalid user name");
        }
    }
}
