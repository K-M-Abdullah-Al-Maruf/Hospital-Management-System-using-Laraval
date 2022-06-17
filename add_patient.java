package com.Hospital;
import java.util.Scanner;

public class add_patient extends patient{
    Scanner sc = new Scanner(System.in);

    public add_patient() {
        System.out.print("\nPlease enter your name:");
        String n = sc.nextLine();
        set_name(n);

        while (true) {
            System.out.print("Please enter your age:");
            if (sc.hasNextInt()) {
                set_age(sc.nextInt());
                sc.nextLine();
                break;
            } else {
                System.out.println("\n***Invalid input.Please try again.***\n");
            }
            sc.next();
        }

        System.out.print("Please enter your address:");
        String add = sc.nextLine();
        set_address(add);

        System.out.print("Please enter your id:");
        String id = sc.nextLine();
        set_id(id);

        while(true)
        {
            System.out.print("Please enter your password:");
            String pass = sc.nextLine();
            System.out.print("Please re-enter your password:");
            if (pass.equals(sc.nextLine())) {
                set_pass(pass);
                break;
            } else {
                System.out.println("Password do not match.\n Please try again.");
            }
        }
    }
}
