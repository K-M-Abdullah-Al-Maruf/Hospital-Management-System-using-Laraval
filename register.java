package com.Hospital;

public class register {

    private static String name;
    private static int age;
    private static String id;
    private static String address;
    private static String pass;

    public void set_name(String n)
    {
        name = n;
    }


    public void set_age(int a)
    {
        age = a;
    }


    public void set_address(String a)
    {
        address = a;
    }
    public void set_id(String p)
    {
        id = p;
    }


    public void set_pass(String p)
    {
        pass = p;
    }


    public String get_name()
    {
        return name;
    }


    public int get_age()
    {
        return age;
    }
    public static String get_id()
    {
        return id;
    }
    public String get_address()
    {
        return address;
    }


    public static String data()
    {
        int count = register_count.get_count();
        System.out.println(count);
        register_count.add_count();
        return "Register " + (char)count + ":\n Name: " + name + "\n Age: " + age + "\n Address: " + address +  "\n Id: " + id + "\n Password: " + pass + "\n$";
    }


    public static String id_pass()
    {
        return id + " " + pass + " ";
    }
}
