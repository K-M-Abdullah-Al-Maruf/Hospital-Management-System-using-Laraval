package com.Hospital;
import java.io.FileWriter;

public class password_changing{
    private String [] admin_array = Admin_login.get_admin_login_detail();
    private String [] register_array = register_login.get_register_login_detail();
    private String [] patient_array = patient_login.get_patient_login_detail();

    //******************************************Admin password changing block
    public void admin_password_changing()
    {
        String new_details = "";
        for(int i = 0; i < admin_array.length; i = i + 2) {
            if(i == admin_array.length - 1)
                new_details = new_details.concat((admin_array[i] + " " + admin_array[i + 1]));
            else
                new_details = new_details.concat((admin_array[i] + " " + admin_array[i + 1] + " \n"));
        }

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\Admin_id_pass.txt");

            writer.write(new_details);
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("Can not edit admin password due to " + ex);
        }

    }


    //******************************************Register password changing block
    public void register_password_changing()
    {
        String new_details = "";
        for(int i = 0; i < register_array.length; i = i + 2) {
            if(i == register_array.length - 1)
                new_details = new_details.concat((register_array[i] + " " + register_array[i + 1]));
            else
                new_details = new_details.concat((register_array[i] + " " + register_array[i + 1] + " \n"));
        }

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_id_pass.txt");

            writer.write(new_details);
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("Can not edit register password due to " + ex);
        }
    }

    //******************************************Patient password changing block
    public void patient_password_changing()
    {
        String new_details = "";
        for(int i = 0; i < patient_array.length; i = i + 2) {
            if(i == patient_array.length - 1)
                new_details = new_details.concat((patient_array[i] + " " + patient_array[i + 1]));
            else
                new_details = new_details.concat((patient_array[i] + " " + patient_array[i + 1] + " \n"));
        }

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_id_pass.txt");

//            System.out.println(new_details);
            writer.write(new_details);
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("Can not edit patient password due to " + ex);
        }
    }
}
