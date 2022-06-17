package com.Hospital;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class register_id_pass_control
{
    public register_id_pass_control()
    {
        String data = "";
        File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_id_pass.txt");

        try(Scanner sc = new Scanner(file))
        {
            while(sc.hasNextLine())
            {
                data = data.concat(sc.nextLine() + "\n");
            }
        }
        catch(Exception ex)
        {
            System.out.println("Could not read register id and pass due to " + ex);
        }


        try
        {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_id_pass.txt");
            writer.write(data + register.id_pass());
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("Could not store register id and pass due to " + ex);
        }
    }
}
