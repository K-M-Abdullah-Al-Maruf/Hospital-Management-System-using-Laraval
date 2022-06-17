package com.Hospital;
import java.util.Scanner;

public class register_control {
    Scanner sc = new Scanner(System.in);

    public register_control() {
        int register_cmd;

        while (true) {
            System.out.println("\n1.Patient Details\n2.Doctor Details\n3.Register Details\n4.Admin Details\n5.Add Patient\n6.Remove Patient\n7.Change Password\n8.Main Menu\n9.Exit");

            while (true)
            {
                if (sc.hasNextInt())
                {
                    register_cmd = sc.nextInt();
                    if ((register_cmd >= 1) && (register_cmd <= 9))
                        break;
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again from 1 to 9***\n");
                    }
                }
                else
                {
                    System.out.println("\n***Invalid input.Please try again.***\n");
                }
                sc.nextLine();
            }


            //**************************************Patient details
            if (register_cmd == 1) {
                patient_info_display pi = new patient_info_display();
                System.out.println(pi.register_view());

                int register_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt())
                    {
                        register_cmd_2 = sc.nextInt();
                        if ((register_cmd_2 >= 1) && (register_cmd_2 <= 2))
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
                if (register_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }

            }

            //**************************************Doctor details
            else if (register_cmd == 2)
            {
                doctor_info_display di = new doctor_info_display();
                System.out.println(di.register_view());
                sc.nextLine();
                System.out.print("Please enter your doctor number (i.g. 1 or 2 or 3):");
                di.selected_doctor_details(sc.nextInt());
                System.out.println(di.register_view());

                int register_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt())
                    {
                        register_cmd_2 = sc.nextInt();
                        if ((register_cmd_2 >= 1) && (register_cmd_2 <= 2))
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
                if (register_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }

            }

            //**************************************Register details
            else if (register_cmd == 3)
            {
                register_info_display pi = new register_info_display();
                System.out.println(pi.register_view());

                int register_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        register_cmd_2 = sc.nextInt();
                        if ((register_cmd_2 >= 1) && (register_cmd_2 <= 2))
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
                if (register_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //**************************************Admin details
            else if (register_cmd == 4)
            {
                admin_info_display pi = new admin_info_display();
                System.out.println(pi.register_view());

                int register_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        register_cmd_2 = sc.nextInt();
                        if ((register_cmd_2 >= 1) && (register_cmd_2 <= 2))
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
                if (register_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }

            }

            //**************************************adding patient
            else if (register_cmd == 5)
            {
                new patient_info();

                int register_cmd_2;
                System.out.println("*****DONE*****\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        register_cmd_2 = sc.nextInt();
                        if ((register_cmd_2 >= 1) && (register_cmd_2 <= 2))
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
                if (register_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //**************************************removing patient
            else if (register_cmd == 6)
            {
                patient_info_display pi = new patient_info_display();
                System.out.println(pi.register_view());
                sc.nextLine();
                System.out.print("Please enter patient number to remove(i.g. 1 or 2 or 3  [ENTER 0 TO GO BACK]):");
                int d = sc.nextInt();
                if(d == 0)
                {
                }
                else {
                    new remove_patient().remove_patient(d);

                    int register_cmd_2;
                    System.out.println("*****DONE*****\n1.Back\n2.Exit ");
                    while (true)
                    {
                        if (sc.hasNextInt())
                        {
                            register_cmd_2 = sc.nextInt();
                            if ((register_cmd_2 >= 1) && (register_cmd_2 <= 2))
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
                    if (register_cmd_2 == 2) {
                        new exit_msg();
                        System.exit(0);
                    }
                }
            }

            //***********************************changing password
            else if (register_cmd == 7) {
                register_login ad = new register_login();
                ad.change_password();

                int register_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt())
                    {
                        register_cmd_2 = sc.nextInt();
                        if ((register_cmd_2 >= 1) && (register_cmd_2 <= 2))
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
                if (register_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //***********************************going back to Main Menu
            else if (register_cmd == 8) {
                break;
            }

            //***********************************closing program
            else if (register_cmd == 9) {
                new exit_msg();
                System.exit(0);
            }
        }
    }

}
