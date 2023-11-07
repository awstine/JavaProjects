package Assignments;

import java.util.Scanner;

public class NegativeNumberException2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException(); // Creating exception without a message
                }
            } catch (NegativeNumberException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } catch (Exception ex) {
                System.out.println("Another exception occurred: " + ex.getMessage());
            }
        }
    }
