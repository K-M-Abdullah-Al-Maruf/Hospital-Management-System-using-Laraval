package com.Hospital;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class patient_count
{
    public static int var;
    public static int get_count() {
        File file = new File("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_count.txt");

        try (Scanner sc = new Scanner(file)) {
            char count = sc.next().charAt(0);
            var = ((int)count);

        } catch (Exception ex) {
            System.out.println("could not read patient count");
        }

        return var;
    }

    public static void add_count()
    {
        var++;
        try
        {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_count.txt");
            writer.write((char)var);

            writer.close();
        } catch (Exception ex) {
            System.out.println("could not read patient count2");
        }

    }

    public static void reduce_count()
    {
        var--;
        try
        {
            FileWriter writer = new FileWriter("C:\\Users\\Maruf\\My Projects\\Hospital Management\\src\\com\\Hospital\\patient_count.txt");
            writer.write((char)var);

            writer.close();
        } catch (Exception ex) {
            System.out.println("could not read patient count2");
        }
    }


}
