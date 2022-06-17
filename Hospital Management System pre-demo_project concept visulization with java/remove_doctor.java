package com.Hospital;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class remove_doctor
{
    public void remove_doctor(int d) {
        String doctor_new_detail = "";
        String[] detail = new String[doctor_count.get_count() - (int) '1'];
//        System.out.println("doctor_count.get_count()= " + (doctor_count.get_count() - (int) '1'));
        String info = "";
        int index = 0;
        try {
            File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\doctor_info.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
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
                if (y.charAt(0) == 'D')
                    y = sc.nextLine();

                if (y.equals("$")) {

                    detail[index] = info;
                    info = "";
                    index++;
                } else {
//                    System.out.println("index = " + index);
                    info = info + y + "\n";
//                    System.out.println(info);
                }

            }
//            for (int i = 0; i < detail.length; i++)
//                System.out.println(detail[i]);
        } catch (Exception ex) {
            System.out.println("Could not remove doctor due to " + ex);
        }

        int a = 1;

        for (int i = 0; i < detail.length; i++) {
            if (i == (d - 1)) {
            } else {
                if(doctor_new_detail.equals(""))
                    doctor_new_detail =  "Doctor " + (a) + ":\n" + detail[i] + "$\n" + "\n";
                else if(i == (detail.length - 1))
                    doctor_new_detail = doctor_new_detail + "Doctor " + (a) + ":\n" + detail[i] + "$\n" ;
                else
                    doctor_new_detail = doctor_new_detail + "Doctor " + (a) + ":\n" + detail[i] + "$\n" + "\n";
                a++;
            }
        }

//        System.out.println(doctor_new_detail);

        //updating patient info
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\doctor_info.txt");

            writer.write(doctor_new_detail);
            writer.close();
        } catch (Exception ex) {
            System.out.println("Can not update doctor info due to " + ex);
        }

        //updating doctor count
        doctor_count.reduce_count();

    }
}
