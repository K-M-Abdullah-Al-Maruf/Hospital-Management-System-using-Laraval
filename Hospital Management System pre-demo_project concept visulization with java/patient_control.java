package com.Hospital;
import java.util.Scanner;

public class patient_control {
    Scanner sc = new Scanner(System.in);

    public patient_control() {
        int patient_cmd;

        while (true) {
            System.out.println("\n1.Details\n2.Doctor Details\n3.Register Details\n4.Admin Details\n5.Change Password\n6.Main Menu\n7.Exit");

            while (true)
            {
                if (sc.hasNextInt())
                {
                    patient_cmd = sc.nextInt();
                    if ((patient_cmd >= 1) && (patient_cmd <= 9))
                        break;
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again from 1 to 9***\n");
                    }
                } else
                {
                    System.out.println("\n***Invalid input.Please try again.***\n");
                }
                sc.nextLine();
            }


            //**************************************Patient details
            if (patient_cmd == 1) {
                patient_info_display pi = new patient_info_display();
                System.out.println("\n" + pi.user_patient_display());

                int patient_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        patient_cmd_2 = sc.nextInt();
                        if ((patient_cmd_2 >= 1) && (patient_cmd_2 <= 2))
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
                if (patient_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }

            }

            //**************************************Doctor details
            else if (patient_cmd == 2) {
                doctor_info_display di = new doctor_info_display();
                System.out.println(di.patient_view());
                sc.nextLine();
                System.out.print("Please enter your doctor number (i.g. 1 or 2 or 3   [ENTER 0 TO GO BACK]):");
                int usr_cmd = sc.nextInt();
                if (usr_cmd == 0)
                {
                }

                else
                {
                    di.selected_doctor_details(usr_cmd);
                    System.out.println(di.patient_view());


                    int patient_cmd_2;
                    System.out.println("\n1.Take serial\n2.Back\n3.Exit ");
                    while (true)
                    {
                        if (sc.hasNextInt())
                        {
                            patient_cmd_2 = sc.nextInt();
                            if ((patient_cmd_2 >= 1) && (patient_cmd_2 <= 3))
                                break;
                            else
                            {
                                System.out.println("\n***Invalid input.Please try again from 1 to 3***\n");
                            }
                        }
                        else
                        {
                            System.out.println("\n***Invalid input.Please try again.***\n");
                        }
                        sc.next();
                    }
                    if (patient_cmd_2 == 1) {
                        di.taking_consult();
                    } else if (patient_cmd_2 == 3) {
                        new exit_msg();
                        System.exit(0);
                    }
                }

            }

            //**************************************Register details
            else if (patient_cmd == 3)
            {
                register_info_display pi = new register_info_display();
                System.out.println(pi.patient_view());

                int patient_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        patient_cmd_2 = sc.nextInt();
                        if ((patient_cmd_2 >= 1) && (patient_cmd_2 <= 2))
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
                if (patient_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //**************************************Admin details
            else if (patient_cmd == 4)
            {
                admin_info_display pi = new admin_info_display();
                System.out.println(pi.patient_view());

                int patient_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        patient_cmd_2 = sc.nextInt();
                        if ((patient_cmd_2 >= 1) && (patient_cmd_2 <= 2))
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
                if (patient_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }

            }


            //***********************************changing password
            else if (patient_cmd == 5) {
                patient_login ad = new patient_login();
                ad.change_password();

                int patient_cmd_2;
                System.out.println("\n1.Back\n2.Exit ");
                while (true)
                {
                    if (sc.hasNextInt()) {
                        patient_cmd_2 = sc.nextInt();
                        if ((patient_cmd_2 >= 1) && (patient_cmd_2 <= 2))
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
                if (patient_cmd_2 == 2) {
                    new exit_msg();
                    System.exit(0);
                }
            }

            //***********************************going back to Main Menu
            else if (patient_cmd == 6) {
                break;
            }

            //***********************************closing program
            else if (patient_cmd == 7) {
                new exit_msg();
                System.exit(0);
            }
        }
    }
}
