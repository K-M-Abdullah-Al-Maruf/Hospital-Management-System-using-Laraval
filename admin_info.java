package com.Hospital;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class admin_info{

    public admin_info()
    {

        add_admin add = new add_admin();
        admin_id_pass_control hq = new admin_id_pass_control();

        File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\admin_info.txt");

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
            writer.write(data + "\n" + admin.data());

            writer.close();

        }
        catch(Exception ex)
        {
            System.out.println("Can not save admin info");
        }
    }


}
