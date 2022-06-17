package com.Hospital;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class admin_id_pass_control
{
    public admin_id_pass_control()
    {
        String data = "";
        File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\admin_id_pass.txt");

        try(Scanner sc = new Scanner(file))
        {
            while(sc.hasNextLine())
            {
                data = data.concat(sc.nextLine() + "\n");
            }
        }
        catch(Exception ex)
        {
            System.out.println("Could not read admin id and pass due to " + ex);
        }


        try
        {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\admin_id_pass.txt");
            writer.write(data + admin.id_pass());
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("Could not store admin id and pass due to " + ex);
        }
    }
}
