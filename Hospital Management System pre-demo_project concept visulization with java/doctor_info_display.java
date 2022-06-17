package com.Hospital;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class doctor_info_display {
    private String admin_doctor_info = "";
    private String others_doctor_info = "";
    private String [] consult;
    private int doctor_number;

    public doctor_info_display()
    {
        try
        {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\doctor_info.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
            {
                int count = 0;
                int count1 = 0;
                int count2 = 0;
                String y = sc.nextLine();
                String z = "Doctor";
                String z1 = " Name:";
                String z2 = " Field:";

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

                if(count != z.length())
                {
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
                }

                if(count1 != z1.length())
                {
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
                }

                if((count == z.length()) || ((count1 == z1.length())) || ((count1 == z2.length()))) {
                    others_doctor_info = others_doctor_info + y + "\n";
                    admin_doctor_info = admin_doctor_info + y + "\n";
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);

        }

    }

    //selected doctor info
    public void selected_doctor_details(int d)
    {
        doctor_number = d;
        admin_doctor_info = "";
        others_doctor_info = "";
        String time = "";

        String doctor_name = "Doctor " + d + ":";
        String y1 = " Consultation Hour:";
        boolean doctor_name_match = false;
        boolean doctor_consult_match = false;

        try {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\doctor_info.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String y = sc.nextLine();

                if (y.equals(doctor_name))
                {
                    doctor_name_match = true;
                }

                if((doctor_name_match == true) )
                {
                    if (y.equals(y1))
                    {
                        doctor_consult_match = true;
                    }
                }
                if((doctor_name_match == true) )
                {

                    if (y.equals("$"))
                    {
                        break;
                    }
                    else
                    {
                        if(admin_doctor_info.equals(""))
                            admin_doctor_info = y + "\n";
                        else
                            admin_doctor_info = admin_doctor_info + y + "\n";

                        if( (doctor_consult_match == true))
                        {

                            if (others_doctor_info.equals(""))
                                others_doctor_info = y + "\n";
                            else
                            {
                                others_doctor_info = others_doctor_info + y + "\n";
                                time = time + y + "\n";
                            }
                        }
                    }
                }
            }
        }

        catch(Exception ex)
        {
            System.out.println("Could not print selected doctor details dut to " + ex);
        }

        consult = time.split("   \n");

    }

    //****************************************************Time update for taken consultation
    public void taking_consult() {

        while (true)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n" + others_doctor_info);
            System.out.print("\nPlease select any available time (i.g. 1 or 2 or 3   [ENTER 0 TO GO BACK]):");

            int cmd;

            while (true)
            {
                while (true)
                {
                    if (sc.hasNextInt())
                    {
                        cmd = sc.nextInt();
                        if ((cmd >= 0) && (cmd <= consult.length))
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("\n***Invalid input.Please select from 1 to " + (consult.length) + ".***\n");
                        }
                    }
                    else
                    {
                        System.out.println("\n***Invalid input.Please try again.***\n");
                    }
                    sc.nextLine();
                }

                if(cmd == 0)
                    break;

                String box = consult[cmd - 1];
                String[] altr = box.split(" ");
                String sure = "Available";

                if (altr[altr.length - 1].equals(sure)) {
                    break;
                } else {
                    System.out.println(consult[cmd - 1] + "\n Please choose another consultation hour.");
                }
            }

            if(cmd == 0)
                break;

            String box = consult[cmd - 1];
            String[] alt = box.split(" ");

            alt[alt.length - 1] = " is occupied by " + (patient_login.get_patient_login_detail(patient_login.get_patient_id_index()));

            String s = "";
            s = " " + alt[1] + alt[alt.length - 1];
            consult[cmd - 1] = s;
            String b = "";

            for (int a = 0; a < consult.length; a++) {
                b = b + consult[a] + "   \n";
            }


            String doctor_name = "Doctor " + doctor_number + ":";
            String y1 = " Consultation Hour:";
            boolean doctor_name_match = false;
            boolean doctor_consult_match = false;
            String update = "";

            //********************************reading from doctor_info.txt
            try {
                File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\doctor_info.txt");
                Scanner ss = new Scanner(file);

                while (ss.hasNextLine()) {

                    String y = ss.nextLine();

                    if (update.equals(""))
                        update = y + "\n";
                    else
                        update = update + y + "\n";

                    if (y.equals(doctor_name)) {
                        doctor_name_match = true;
                    }

                    if ((doctor_name_match == true)) {
                        if (y.equals(y1)) {
                            doctor_consult_match = true;
                        }
                    }
                    if ((doctor_name_match == true)) {
                        if ((doctor_consult_match == true)) {
                            update = update + b;
                            doctor_name_match = false;
                            doctor_consult_match = false;
                            while (true) {
                                if (y.equals("$")) {
                                    update = update + y + "\n";
                                    break;
                                } else
                                    y = ss.nextLine();
                            }

                        }
                    }
                }
            } catch (Exception ex) {
                System.out.println("Could not print selected doctor details dut to " + ex);
            }

            //**********************keeping update in text
            try {
                FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\doctor_info.txt");
                writer.write(update);
                writer.close();
                System.out.println("done");
                break;
            } catch (Exception ex) {
                System.out.println("Could not update time due to " + ex);
            }
        }
    }

    public String register_view()
    {
        return "\n" + others_doctor_info;
    }

    public String admin_view()
    {
        return "\n" + admin_doctor_info;
    }

    public String patient_view()
    {
        return "\n" + others_doctor_info;
    }
}
