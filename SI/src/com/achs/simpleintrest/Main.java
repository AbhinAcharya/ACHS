package com.achs.simpleintrest;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Abhin Prasad Acharya
 * Date: 5/19/20
 * Time: 5:57 PM
 */

import java.util.Scanner;

//WAP to find simple interest. [si=(p*t*r)/100]

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Principal: ");
        double principal = input.nextDouble();
        System.out.print("Input Time : ");
        //Assume that user has given time in years,otherwise we had to check different condition
        int time = input.nextInt();
        System.out.print("input Rate: ");
        float rate = input.nextFloat();
        double simpleInterest = simpleInterest(principal,time,rate);
        System.out.println("Simple Interest is " + simpleInterest);
    }


    public static double simpleInterest(double principal, int time, float rate ){
     double si = (principal * time * rate)/100;
     return  si ;
    }
}
