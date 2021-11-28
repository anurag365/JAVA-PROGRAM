package com.company;
import java.util.Date;
import java.util.Scanner;

public class date_class {
    
    public static void main(String[] args)
    {
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
    }
    
}
