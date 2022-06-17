package com.Hospital;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class remove_patient
{
    public void remove_patient(int d) {
        String patient_new_detail = "";
        String patient_new_id_pass = "";
        String[] detail = new String[patient_count.get_count() - (int) '1'];
        String [] id_pass = new String[patient_count.get_count() - (int) '1'];
//        System.out.println("patient_count.get_count()= " + (patient_count.get_count() - (int) '1'));
        String info = "";
        int index = 0;
        try
        {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_info.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
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
                if (y.charAt(0) == 'P')
                    y = sc.nextLine();

                if (y.equals("$"))
                {

                    detail[index] = info;
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
        catch (Exception ex)
        {
//            System.out.println("Could not remove patient due to " + ex);
        }
        //***********************Reading patient id and pass
        try
        {
            File file1 = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_id_pass.txt");
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
            System.out.println("Can not remove patient id pass due to " + ex);
        }

//            for (int i = 0; i < detail.length; i++)
//                System.out.println(detail[i]);


        int a = 1;

//        for(int i = 0; i < detail.length; i++)
//        {
//            System.out.println("test \n" + detail[i]);
//        }


        for (int i = 0; i < detail.length; i++) {
            if (i == (d - 1))
            {
            }
            else
            {
                if(patient_new_detail.equals(""))
                    patient_new_detail = "Patient " + (a) + ":\n" + detail[i] + "$\n" + "\n";
                else if(i == (detail.length - 1))
                    patient_new_detail = patient_new_detail + "Patient " + (a) + ":\n" + detail[i] + "$\n";
                else
                    patient_new_detail = patient_new_detail + "Patient " + (a) + ":\n" + detail[i] + "$\n"+ "\n";
                a++;
            }
        }

        //*******************************************Updating patient info
        for(int i = 0; i < id_pass.length; i++)
        {
            if(i == (d - 1))
            {
            }
            else
            {
                if (patient_new_id_pass.equals("")) {
                    patient_new_id_pass = id_pass[i] + "\n";
                } else {
                    patient_new_id_pass = patient_new_id_pass + id_pass[i] + "\n";
                }
            }
        }

//        System.out.println(patient_new_detail);

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_info.txt");

            writer.write(patient_new_detail);
            writer.close();
        } catch (Exception ex) {
            System.out.println("Can not update patient info due to " + ex);
        }

        //*******************************************Updating patient in pass info
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_id_pass.txt");

            writer.write(patient_new_id_pass);
            writer.close();
        } catch (Exception ex) {
            System.out.println("Can not update patient id pass info due to " + ex);
        }

        //****************************updating patient count
        patient_count.reduce_count();

    }
}
