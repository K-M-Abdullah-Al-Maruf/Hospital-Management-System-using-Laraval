package com.Hospital;
import java.io.File;
import java.util.Scanner;

public class register_info_display {
    private String admin_register_info = "";
    private String register_register_info = "";
    private String patient_register_info = "";

    public register_info_display()
    {
        try
        {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_info.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
            {
                int count = 0;
                int count1 = 0;
                int count2 = 0;
                String y = sc.nextLine();

                if(y.equals("$"))
                    y = sc.nextLine();

                admin_register_info = admin_register_info + y + "\n";
                String z = " Password";
                String z1 = " Age:";
                String z2 =  " Address:";

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

                for (int i = 0; i < z1.length(); i++)
                {
                    if(y.equals(""))
                        break;
                    else
                    {
                        if ((z1.charAt(i) == y.charAt(i))) {
                            count1++;
                        } else {
                            break;
                        }
                    }

                }

                for (int i = 0; i < z2.length(); i++)
                {
                    if(y.equals(""))
                        break;
                    else
                    {
                        if ((z2.charAt(i) == y.charAt(i))) {
                            count2++;
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
                    register_register_info = register_register_info + y + "\n";
                    if((count1 == z1.length()) || (count2 == z2.length()))
                    {

                    }
                    else
                    {
                        if (patient_register_info.equals(""))
                            patient_register_info = y + "\n";
                        else
                            patient_register_info = patient_register_info + y + "\n";
                    }
                }
            }
        }
        catch (Exception ex)
        {
//            System.out.println(ex);
        }

    }

    public String register_view()
    {
        return "\n" + register_register_info;
    }

    public String admin_view()
    {
        return "\n" + admin_register_info;
    }

    public String patient_view()
    {
        return "\n" + patient_register_info;
    }
}
