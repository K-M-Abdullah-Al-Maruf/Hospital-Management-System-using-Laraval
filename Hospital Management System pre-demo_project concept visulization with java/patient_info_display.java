package com.Hospital;
import java.io.File;
import java.util.Scanner;

public class patient_info_display {
    private String admin_patient_info = "";
    private String register_patient_info = "";

    public patient_info_display()
    {
        try
        {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_info.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
            {
                int count = 0;
                String y = sc.nextLine();

                if(y.equals("$"))
                    y = sc.nextLine();

                if(admin_patient_info.equals(""))
                    admin_patient_info = y + "\n";
                else
                    admin_patient_info = admin_patient_info + y + "\n";

                String z = " Password";

                for (int i = 0; i < z.length(); i++)
                {
                    if(y.equals(""))
                        break;
                    else
                    {
                        if ((z.charAt(i) == y.charAt(i))) {
                            count++;
                        } else {
                            break;
                        }
                    }

                }

                if(count == z.length())
                {

                }
                else
                {
                    register_patient_info = register_patient_info + y + "\n";
                }
            }
        }
        catch (Exception ex)
        {
//            System.out.println("blabla " + ex);
        }

    }

    public String user_patient_display()
    {
        String detail = "";
        String id = patient_login.get_patient_login_detail(patient_login.get_patient_id_index());
        String pass = patient_login.get_patient_login_detail((patient_login.get_patient_id_index() + 1));
        String z = " Id: " + id;
        String z1 = " Password: " + pass;
        boolean match = false;
        boolean match1 = false;

        try {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_info.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int count = 0;
                String y = sc.nextLine();

                if(detail.equals(""))
                    detail = y + "\n";
                else if (y.equals("$"))
                {
                }
                else
                    detail = detail + y + "\n";

                if(y.equals(z))
                {
                    match = true;
                }

                if(y.equals(z1))
                {
                    match1 = true;
                }

                if(y.equals("$"))
                {
                    if(match == true)
                        if(match1 == true)
                            break;
                        else
                            detail = "";
                    else
                        detail = "";
                }

            }
        }
        catch(Exception ex)
        {
            System.out.println("Could not import user details due to " + ex);
        }

        return detail;

    }

    public String register_view()
    {
        return "\n" + register_patient_info;
    }

    public String admin_view()
    {
        return "\n" + admin_patient_info;
    }
}
