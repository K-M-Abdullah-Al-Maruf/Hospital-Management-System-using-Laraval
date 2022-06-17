package com.Hospital;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class register_info{

    public register_info()
    {

        add_register add = new add_register();
        register_id_pass_control hq = new register_id_pass_control();

        File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_info.txt");

        try(Scanner sc = new Scanner(file))
        {
            String data = "";

            while(sc.hasNextLine())
            {
                if(data.equals(""))
                    data = sc.nextLine() + "\n";      //newly added \n

                data = data.concat(sc.nextLine() + "\n");
            }

            FileWriter writer = new FileWriter(file);
            writer.write(data  + "\n"+ register.data());

            writer.close();

        }
        catch(Exception ex)
        {
            System.out.println("Can not save register info due to " + ex);
        }
    }


}
