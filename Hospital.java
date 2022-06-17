package com.Hospital;
import java.util.Scanner;
public class Hospital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user_cmd1;
        while (true)
        {
//-----------------------------------------------------------------------------------------------------------
        //welcome logo
        new headline();
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
        //log in



            System.out.println("1.Admin login\n2.Register login\n3.Patient login\n4.Schedule\n5.Address\n6.Exit");

            while (true)
            {

                if (sc.hasNextInt())
                {
                    user_cmd1 = sc.nextInt();
                    if ((user_cmd1 >= 1) && (user_cmd1 <= 6))
                        break;
                    else
                        System.out.println("\n***Invalid input.Please try again from 1 to 6.***\n");
                }
                else
                {
                    System.out.println("\n***Invalid input.Please try again.***\n");
                }
                sc.nextLine();
            }

            //*******************************************admin access
            if (user_cmd1 == 1) {
                Admin_login hq = new Admin_login();
                hq.Admin_login_control();
                if (hq.get_key() == true) {
                    new admin_control();
                } else {
                    System.out.println("\nInvalid admin id and pass\n");
                }
            }

            //******************************************register access
            else if (user_cmd1 == 2) {
                register_login hq = new register_login();
                hq.register_login_control();
                if (hq.get_key() == true) {
                    new register_control();
                } else {
                    System.out.println("\nInvalid register id and pass\n");
                }
            }

            //****************************************patient access
            else if (user_cmd1 == 3) {
                patient_login hq = new patient_login();
                hq.patient_login_control();
                if (hq.get_key() == true) {
                    new patient_control();
                } else {
                    System.out.println("\nInvalid patient id and pass\n");
                }
            }

            //*****************Schedule
            else if (user_cmd1 == 4)
            {
                new schedule();
                int user_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true) {
                    if (sc.hasNextInt()) {
                        user_cmd_2 = sc.nextInt();
                        if ((user_cmd_2 >= 1) && (user_cmd_2 <= 2))
                            break;
                    } else {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (user_cmd_2 == 2)
                {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //********************Address
            else if (user_cmd1 == 5)
            {
                new address();
                int user_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true) {
                    if (sc.hasNextInt()) {
                        user_cmd_2 = sc.nextInt();
                        if ((user_cmd_2 >= 1) && (user_cmd_2 <= 2))
                            break;
                    } else {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (user_cmd_2 == 2)
                {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //*************************************exit from programme
            else {
            exit_msg ei = new exit_msg();
            System.exit(0);
        }


        }

    }
}
