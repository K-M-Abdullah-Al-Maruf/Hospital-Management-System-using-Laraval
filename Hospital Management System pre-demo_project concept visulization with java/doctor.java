package com.Hospital;

public class doctor {
    private static String name = "";
    private static int age;
    private static int count = doctor_count.get_count();
    private static String field = "";
    private static String address = "";
    private static String consult_time = "";

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
    public void set_field(String p)
    {
        field = p;
    }


    public void set_consult_time(String p)
    {
        consult_time = p;
    }


    public String get_name()
    {
        return name;
    }


    public int get_age()
    {
        return age;
    }
    public static String get_field()
    {
        return field;
    }
    public String get_address()
    {
        return address;
    }


    public String get_consult_time()
    {
        return consult_time;
    }

    public static String data()
    {
        System.out.println(count);
        doctor_count.add_count();
        return "Doctor " + (char)count + ":\n Name: " + name + "\n Age: " + age + "\n Address: " + address +  "\n Field: " + field + "\n Consultation Hour:\n" + consult_time + "$";
    }

    public static String patient_view()
    {
        return " Name: " + name + "\n Field: " + field;
    }

}
