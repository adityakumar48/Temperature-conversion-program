package com.aditya;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Please Enter Your Temperature: ");

        float TempC = in.nextFloat();

        float TempF = (TempC * 9/5) +32;

        System.out.println(TempF);

    }
}
