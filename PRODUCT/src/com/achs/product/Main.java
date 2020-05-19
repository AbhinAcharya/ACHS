package com.achs.product;
/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Abhin Prasad Acharya
 * Date: 5/19/20
 * Time: 5:44 PM
 */
//WAP to find the product of two numbers.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb1;
        int numb2;
        System.out.print("Input First Number: ");
        numb1 = input.nextInt();
        System.out.print("Input Second Number: ");
        numb2 = input.nextInt();
        int totalSum = product(numb1,numb2);
        System.out.printf("Product = "+ totalSum);

    }
    public static int product(int firstNumber, int secondNumber){
        int product = firstNumber * secondNumber;
        return product;

    }
}