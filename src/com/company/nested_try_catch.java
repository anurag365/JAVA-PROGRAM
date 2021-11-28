package com.company;

import java.util.Scanner;

public class nested_try_catch {

    public static void main(String[] args) {
        int a = 40;
        int b = 0;

        try {
            System.out.println("HI");
            try {
                int c = a / b;
            }

            catch (Exception e) {
                System.out.println("error is");
                System.out.println(e);
            }
        }

        catch (Exception e) {
            System.out.println("level 1");
        }
    }
}