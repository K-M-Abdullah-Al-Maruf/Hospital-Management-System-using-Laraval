package com.Hospital;
import java.io.File;
import java.util.Scanner;

public class admin_info_display {
    private String admin_admin_info = "";
    private String register_admin_info = "";

    public admin_info_display()
    {
        try
        {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\admin_info.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
            {
                int count1 = 0;
                int count2 = 0;
                int count3 = 0;
                String y = sc.nextLine();
                String z1 = " Password";
                String z2 = " Age:";
                String z3 = " Address:";

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

                for (int i = 0; i < z3.length(); i++)
                {
                    if(y.equals(""))
                        break;
                    else
                    {
                        if ((z3.charAt(i) == y.charAt(i))) {
                            count3++;
                        } else {
                            break;
                        }
                    }

                }

                if(count1 == z1.length()) {
                }
                else
                {
                    admin_admin_info = admin_admin_info + y + "\n";
                    if((count2 == z2.length()) || (count3 == z3.length()))
                    {
                    }
                    else
                    {
                        register_admin_info = register_admin_info + y + "\n";
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

    }

    public String register_view()
    {
        return "\n" + register_admin_info;
    }

    public String admin_view()
    {
        return "\n" + admin_admin_info;
    }

    public String patient_view()
    {
        return "\n" + register_admin_info;
    }
}
