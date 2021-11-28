package com.company;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return   "I AM  TOSTRING()";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return  "I AM GETMESSAGE()";
    }
}

public class excption_class {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE");
        a = sc.nextInt();
        if (a < 10) {
            try {
                throw new MyException();
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();//used to know error in which line
                System.out.println(e.toString());
            }

        }

    }
}
