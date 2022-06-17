package com.Hospital;
import java.util.Scanner;
import java.io.File;

public class Admin_login  {
    private static int id_index;
    private static String [] admin_login_detail;
    private String dtl = "";
    private boolean key = false;

    public static String [] get_admin_login_detail()
    {
        return admin_login_detail;
    }

    public int get_admin_login_detail_length()
    {
        return admin_login_detail.length;
    }

    //admin id and pass check
    public Admin_login() {
        try {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\Admin_id_pass.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                dtl = dtl.concat(sc.nextLine());
            }
            admin_login_detail = dtl.split(" ");
        } catch (Exception ex) {
            System.out.println("Can not import due to exception error");
        }
    }

    public void Admin_login_control()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("ID:");
        String id = sc.nextLine();
        System.out.print("Password:");
        String pass = sc.nextLine();

        for(int i = 0; i < admin_login_detail.length; i = i + 2) {
            if ((admin_login_detail[i].equals(id)) && (admin_login_detail[i + 1].equals(pass))) {
                id_index = i;
//                System.out.println(id_index);
                key = true;
                break;
            }
        }
    }

    //changing password
    public void change_password()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(id_index);
        while(true) {
            System.out.println("Please enter your old password");
            String old_password = sc.nextLine();
            if (admin_login_detail[id_index + 1].equals(old_password)) {
                System.out.println("Enter new password");
                String new_password = sc.nextLine();
                System.out.println("Re-enter new password");
                if(new_password.equals(sc.nextLine()))
                {
                    admin_login_detail[id_index + 1] = new_password ;
                    password_changing pass_changing = new password_changing();
                    pass_changing.admin_password_changing();
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
        return key;
    }
}
