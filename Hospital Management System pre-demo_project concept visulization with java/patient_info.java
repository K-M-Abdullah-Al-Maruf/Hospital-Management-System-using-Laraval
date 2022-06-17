package com.Hospital;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class patient_info{

    public patient_info()
    {

        add_patient add = new add_patient();
        patient_id_pass_control hq = new patient_id_pass_control();

        File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_info.txt");

        try(Scanner sc = new Scanner(file))
        {
            String data = "";

            while(sc.hasNextLine())
            {
                if(data.equals(""))
                    data = sc.nextLine() + "\n";
                else
                    data = data.concat(sc.nextLine() + "\n");
            }

            FileWriter writer = new FileWriter(file);
            writer.write(data + "\n" + patient.data());

            writer.close();

        }
        catch(Exception ex)
        {
            System.out.println("Can not save patient info");
        }
    }


}
