package com.Hospital;

import java.io.File;
import java.util.Scanner;

public class register_login {
    private static int register_id_index;
    private static String [] register_login_detail;
    private String dtl = "";
    private boolean register_key = false;

    public static String [] get_register_login_detail()
    {
        return register_login_detail;
    }

    public int get_register_login_detail_length()
    {
        return register_login_detail.length;
    }

    //register id and pass check
    public register_login() {
        try {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_id_pass.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                dtl = dtl.concat(sc.nextLine());
            }
            register_login_detail = dtl.split(" ");
        } catch (Exception ex) {
            System.out.println("Can not import register id pass due to exception error of " + ex);
        }
    }

    public void register_login_control()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("ID:");
        String id = sc.nextLine();
        System.out.print("Password:");
        String pass = sc.nextLine();

        for(int i = 0; i < register_login_detail.length; i = i + 2) {
            if ((register_login_detail[i].equals(id)) && (register_login_detail[i + 1].equals(pass))) {
                register_id_index = i;
//                System.out.println(register_id_index);
                register_key = true;
                break;
            }
        }
    }

    //changing password
    public void change_password()
    {
        Scanner sc = new Scanner(System.in);
//        System.out.println(register_id_index);
        while(true) {
            System.out.println("Please enter your old password");
            String old_password = sc.nextLine();
            if (register_login_detail[register_id_index + 1].equals(old_password)) {
                System.out.println("Enter new password");
                String new_password = sc.nextLine();
                System.out.println("Re-enter new password");
                if(new_password.equals(sc.nextLine()))
                {
                    register_login_detail[register_id_index + 1] = new_password ;
                    password_changing pass_changing = new password_changing();
                    pass_changing.register_password_changing();
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
        return register_key;
    }

    public static String get_register_login_detail(int i)
    {
        return register_login_detail[i];
    }
}
