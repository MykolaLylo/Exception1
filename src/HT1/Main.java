package HT1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number: ");
        int number = scanner.nextInt() ;
        chekNumber(number);
        }catch (InputMismatchException e){
            throw new InputMismatchException("Only integer number");
        }


    }
    public static void chekNumber(int number)  {

            if (number % 2 == 0) {
                System.out.println("Number: " + number + " is even");;
            } else  {
                System.out.println("Number: " + number + " is odd");
            }

    }


}

