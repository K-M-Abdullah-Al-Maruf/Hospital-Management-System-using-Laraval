package com.Hospital;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class doctor_info{

    public doctor_info()
    {

        add_doctor add = new add_doctor();

        File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\doctor_info.txt");

        try(Scanner sc = new Scanner(file))
        {
            String data = "";

            while(sc.hasNextLine())
            {
                if(data.equals(""))
                    data = sc.nextLine() + "\n";
                data = data.concat(sc.nextLine() + "\n");
            }

            FileWriter writer = new FileWriter(file);
            writer.write(data + "\n" + doctor.data());

            writer.close();

        }
        catch(Exception ex)
        {
            System.out.println("Can not save doctor info due to " + ex);
        }
    }


}
