package Assignments;


import java.util.*;

public class GetTwoNumbers {
    public static void main(String args[]) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the first non-negative number: ");
        int firstNumber = stdin.nextInt();
        System.out.print("Enter the second non-negative number: ");
        int secondNumber = stdin.nextInt();

        if (firstNumber < 0 || secondNumber < 0) {
            throw new InputMismatchException("Negative number entered.");
        }

        System.out.println("Your numbers are " + firstNumber + " and " + secondNumber);
    }
}


//Revised program using Try Catch
//
//import java.util.*;
//
//public class GetNumbers2 {
//    public static void main(String args[]) {
//        Scanner stdin = new Scanner(System.in);
//
//        try {
//            System.out.print("Enter the first non-negative number: ");
//            int firstNumber = stdin.nextInt();
//            System.out.print("Enter the second non-negative number: ");
//            int secondNumber = stdin.nextInt();
//
//            if (firstNumber < 0 || secondNumber < 0) {
//                throw new InputMismatchException("Negative number entered.");
//            }
//
//            System.out.println("Your numbers are " + firstNumber + " and " + secondNumber);
//        } catch (InputMismatchException e) {
//            System.out.println("Input error: " + e.getMessage());
//        }
//    }
//}
