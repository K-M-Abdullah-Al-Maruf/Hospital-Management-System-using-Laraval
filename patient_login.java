package com.Hospital;

import java.io.File;
import java.util.Scanner;

public class patient_login {
    private static int patient_id_index;
    private static String [] patient_login_detail;
    private String dtl = "";
    private boolean patient_key = false;

    public static String [] get_patient_login_detail()
    {
        return patient_login_detail;
    }


    //admin id and pass check
    public patient_login() {
        try {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_id_pass.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                dtl = dtl.concat(sc.nextLine());
            }
            patient_login_detail = dtl.split(" ");
        } catch (Exception ex) {
            System.out.println("Can not import due to exception error due to " + ex);
        }
    }

    public void patient_login_control()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("ID:");
        String id = sc.nextLine();
        System.out.print("Password:");
        String pass = sc.nextLine();

        for(int i = 0; i < patient_login_detail.length; i = i + 2) {
            if ((patient_login_detail[i].equals(id)) && (patient_login_detail[i + 1].equals(pass))) {
                patient_id_index = i;
//                System.out.println(patient_id_index);
                patient_key = true;
                break;
            }
        }
    }

    //changing password
    public void change_password()
    {
        Scanner sc = new Scanner(System.in);
//        System.out.println(patient_id_index);
        while(true) {
            System.out.println("Please enter your old password");
            String old_password = sc.nextLine();
            if (patient_login_detail[patient_id_index + 1].equals(old_password)) {
                System.out.println("Enter new password");
                String new_password = sc.nextLine();
                System.out.println("Re-enter new password");
                if(new_password.equals(sc.nextLine()))
                {
                    patient_login_detail[patient_id_index + 1] = new_password ;
                    password_changing pass_changing = new password_changing();
                    pass_changing.patient_password_changing();
                    System.out.println("Password changed");

                    break;
                }
                else
                    System.out.println("Password do not match");

            } else {
                System.out.println("Wrong password");
            }
        }
    }

    public boolean get_key()
    {
        return patient_key;
    }

    public static int get_patient_id_index()
    {
        return patient_id_index;
    }
    public static String get_patient_login_detail(int i)
    {
        return patient_login_detail[i];
    }
}
