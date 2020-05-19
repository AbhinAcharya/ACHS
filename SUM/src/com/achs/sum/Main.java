package com.achs.sum;
/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Abhin Prasad Acharya
 * Date: 5/19/20
 * Time: 5:24 PM
 */

import java.util.Scanner;


// Sir yo program ma tyo naya method nabani pani garna milxa tara malai naya function ko lai naya method banauna thik lagxa teii vayra gareko

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb1;
        int numb2;
        System.out.print("Input First Number: ");
        numb1 = input.nextInt();
        System.out.print("Input Second Number: ");
        numb2 = input.nextInt();
        int totalSum = sum(numb1,numb2);
        System.out.printf("Sum = "+ totalSum);

    }
    public static int sum(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;

    }
}
