package com.Hospital;
import java.util.Scanner;

public class add_doctor extends doctor{
    Scanner sc = new Scanner(System.in);

    public add_doctor() {
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

        System.out.print("Please enter your field of specialty:");
        String field = sc.nextLine();
        set_field(field);


       int i = 0;
        while (true) {
            System.out.print("Please enter the number of consultation hour you want to have:");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                break;
            } else {
                System.out.println("\n***Invalid input.Please try again.***\n");
            }
            sc.next();
        }
        sc.nextLine();
        String data =" ";
        for(int a = 1; a <= i; a++)
        {
            System.out.print("Please enter your consultation hour:");
            String time = sc.nextLine();
            if(i == a)
                data = data + a + "." + time + " Available   \n";
            else
                data = data + a + "." + time + " Available   \n ";
        }

        set_consult_time(data);

    }
}
