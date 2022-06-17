package com.Hospital;
import java.util.Scanner;

public class admin_control{
    Scanner sc = new Scanner(System.in);


    public admin_control() {
        int admin_cmd;

        while (true) {
            System.out.println("\n1.Patient Details\n2.Doctor Details\n3.Register Details\n4.Admin Details \n5.Add Register\n6.Remove Register\n7.Add Patient\n8.Remove Patient\n9.Add Doctor\n10.Remove Doctor\n11.Add Admin\n12.Change Password\n13.Main Menu\n14.Exit");
            while (true)
            {
                if (sc.hasNextInt())
                {
                    admin_cmd = sc.nextInt();
                    if ((admin_cmd >= 1) && (admin_cmd <= 13))
                        break;
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again from 1 to 13***\n");
                    }
                }
                else
                {
                    System.out.println("\n***Invalid input.Please try again.***\n");
                }
                sc.nextLine();
            }


            //**************************************patient detail view
            if (admin_cmd == 1) {
                patient_info_display pi = new patient_info_display();
                System.out.println(pi.admin_view());

                int admin_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt())
                    {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }

            }

            //**************************************doctor detail view
            if (admin_cmd == 2) {
                doctor_info_display di = new doctor_info_display();
                System.out.println(di.admin_view());
                sc.nextLine();
                System.out.print("Please enter your doctor number (i.g. 1 or 2 or 3):");
                di.selected_doctor_details(sc.nextInt());
                System.out.println(di.admin_view());

                int admin_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt())
                    {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //**************************************register detail view
            if (admin_cmd == 3) {
                register_info_display pi = new register_info_display();
                System.out.println(pi.admin_view());

                int admin_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }


            //**************************************admin detail view
            if (admin_cmd == 4) {
                admin_info_display pi = new admin_info_display();
                System.out.println(pi.admin_view());

                int admin_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //**************************************adding register
            else if (admin_cmd == 5) {
                new register_info();

                int admin_cmd_2;
                System.out.println("*****DONE*****\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //**************************************removing register
            else if (admin_cmd == 6) {
                register_info_display pi = new register_info_display();
                System.out.println(pi.admin_view());
                sc.nextLine();
                System.out.print("Please enter register number to remove(i.g. 1 or 2 or 3  [Enter 0 TO GO BACK]):");
                int d =sc.nextInt();

                if(d ==0 )
                {
                }
                else {
                    new remove_register().remove_register(d);

                    int admin_cmd_2;
                    System.out.println("*****DONE*****\n1.Back\n2.Exit ");
                    while (true)
                    {
                        if (sc.hasNextInt()) {
                            admin_cmd_2 = sc.nextInt();
                            if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                                break;
                            else
                            {
                                System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                            }
                        }
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again.***\n");
                        }
                        sc.nextLine();
                    }
                    if (admin_cmd_2 == 2) {
                        new exit_msg();
                        System.exit(0);
                    }
                }
            }

            //**************************************adding patient
            else if (admin_cmd == 7) {
                new patient_info();

                int admin_cmd_2;
                System.out.println("*****DONE*****\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //**************************************removing patient
            else if (admin_cmd == 8) {
                patient_info_display pi = new patient_info_display();
                System.out.println(pi.admin_view());
                sc.nextLine();
                System.out.print("Please enter patient number to remove(i.g. 1 or 2 or 3   [Enter 0 TO GO BACK]):");

                int d =sc.nextInt();

                if(d ==0 )
                {
                }
                else {
                    new remove_patient().remove_patient(d);

                    int admin_cmd_2;
                    System.out.println("*****DONE*****\n1.Back\n2.Exit ");
                    while (true)
                    {
                        if (sc.hasNextInt()) {
                            admin_cmd_2 = sc.nextInt();
                            if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                                break;
                            else
                            {
                                System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                            }
                        }
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again.***\n");
                        }
                        sc.nextLine();
                    }
                    if (admin_cmd_2 == 2) {
                        new exit_msg();
                        System.exit(0);
                    }
                }
            }

            //**************************************adding doctor
            else if (admin_cmd == 9) {
                new doctor_info();

                int admin_cmd_2;
                System.out.println("\n*****DONE*****1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt())
                    {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //**************************************removing doctor
            else if (admin_cmd == 10) {
                doctor_info_display di = new doctor_info_display();
                System.out.println(di.admin_view());
                sc.nextLine();
                System.out.print("Please enter doctor number to remove(i.g. 1 or 2 or 3   [Enter 0 TO GO BACK]):");
                int d =sc.nextInt();

                if(d == 0 )
                {
                }
                else {
                    new remove_doctor().remove_doctor(d);

                    int admin_cmd_2;
                    System.out.println("*****DONE*****\n1.Back\n2.Exit ");
                    while (true) {
                        if (sc.hasNextInt()) {
                            admin_cmd_2 = sc.nextInt();
                            if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                                break;
                        } else {
                            System.out.println("\n***Invalid input.Please try again.***\n");
                        }
                        sc.nextLine();
                    }
                    if (admin_cmd_2 == 2) {
                        new exit_msg();
                        System.exit(0);
                    }
                }
            }

            //**************************************adding admin
            else if (admin_cmd == 11) {
                new admin_info();

                int admin_cmd_2;
                System.out.println("*****DONE*****\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }


            //***********************************changing password
            else if (admin_cmd == 12) {
                Admin_login ad = new Admin_login();
                ad.change_password();

                int admin_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        admin_cmd_2 = sc.nextInt();
                        if ((admin_cmd_2 >= 1) && (admin_cmd_2 <= 2))
                            break;
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again from 1 to 2***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }
                if (admin_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //***********************************going back to Main Menu
            else if(admin_cmd == 13)
            {
                break;
            }

            //***********************************closing program
            else if (admin_cmd == 14) {
                System.exit(0);

            }
        }
    }
}
