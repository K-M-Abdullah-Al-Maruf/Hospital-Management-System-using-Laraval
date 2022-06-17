package com.Hospital;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class remove_register
{
    public void remove_register(int d)
    {
        String register_new_detail = "";
        String register_new_id_pass = "";
        String [] detail = new String[register_count.get_count() - (int)'1'];
        String [] id_pass = new String[register_count.get_count() - (int) '1'];
//        System.out.println("register_count.get_count()= " + (register_count.get_count() - (int)'1'));
        String info = "";
        int index = 0;
        try
        {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_info.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine())
            {
                String y = sc.nextLine();

                while(true)
                {
                    if (y.equals(""))  //can use while loop
                    {
                        y = sc.nextLine();
                    }
                    else
                        break;
                }
                if (y.charAt(0) == 'R')
                     y = sc.nextLine();

                if (y.equals("$"))
                {
//                    System.out.println("doing detail");
                    detail[index] = info;
//                    System.out.println("done detail");
                    info = "";
                    index++;
                }
                else
                {
//                    System.out.println("index = " + index);
                    info = info + y + "\n";
//                    System.out.println(info);
                }

            }

        }
        catch(Exception ex)
        {
//            System.out.println("Could not remove register due to " + ex);
        }

            //***********************Reading register id and pass
        try
        {
            File file1 = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_id_pass.txt");
            Scanner sc1 = new Scanner(file1);
            int x = 0;

            while(sc1.hasNextLine())
            {
                id_pass [x] = sc1.nextLine();
                x++;
            }
        }

        catch(Exception ex)
        {
            System.out.println("Can not remove register id pass due to " + ex);
        }

//            for(int i =0; i < detail.length;i++)
//                System.out.println(detail[i]);


        int a = 1;

        for(int i = 0; i < detail.length; i++)
        {
            if(i == (d - 1))
            {
            }
            else
            {
                if(register_new_detail.equals(""))
                    register_new_detail =  "Register " + (a) + ":\n" + detail[i] + "$\n" + "\n";
                else if(i == (detail.length - 1))
                    register_new_detail = register_new_detail + "Register " + (a) + ":\n" + detail[i] + "$";
                else
                    register_new_detail = register_new_detail + "Register " + (a) + ":\n" + detail[i] + "$\n" + "\n";
                a++;
            }
        }

//        System.out.println( register_new_detail );

        //*******************************************Updating patient info
        for(int i = 0; i < id_pass.length; i++)
        {

            if(i == (d - 1))
            {
            }
            else
            {
                if (register_new_id_pass.equals("")) {
                    register_new_id_pass = id_pass[i] + "\n";
                } else {
                    register_new_id_pass = register_new_id_pass + id_pass[i] + "\n";
                }
            }
        }

        //*******************************************Updating register info
        try
        {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_info.txt");

            writer.write(register_new_detail);
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("Can not update register info due to " + ex);
        }


        //*******************************************Updating register in pass info
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\register_id_pass.txt");

            writer.write(register_new_id_pass);
            writer.close();
        } catch (Exception ex) {
            System.out.println("Can not update register id pass info due to " + ex);
        }

        //****************************updating register count
        register_count.reduce_count();
    }
}
