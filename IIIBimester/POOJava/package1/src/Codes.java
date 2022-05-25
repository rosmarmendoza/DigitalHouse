//Codes

public class Class1 {

    public static void main(String[] args) {
        int numberA, numberB,sum;
        numberA = 4;
        numberB = 5;
        sum = numberA + numberB;
        //show the operation result
        System.out.println("Result: " + sum);
    }
}



import java.util.Scanner;

public class ExercicesWeek1 {

    public static void main(String[] args){
        //Calculator
        System.out.println("Welcome to this calculator for 2 twc numbers that user will be input to the program");
        Scanner scann  = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int numberOne = scann.nextInt();
        System.out.println("Other number: ");
        int numberTwo = scann.nextInt();
        // int result = numberOne + numberTwo
        System.out.println("Result for this operation: " + (numberOne + numberTwo));
    }
}


    Program that shows if we have a number that is divisible by another number.

        mport java.util.Scanner;
public class playgroundFunctions {
    public static void main(String[] args) {
        System.out.println("****\n\tProgram that shows if we have a number that is divisible by another number. \n\tRosmyDev\n****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberOne = sc.nextInt();
        System.out.println("Enter another number: ");
        int numberTwo = sc.nextInt();
        boolean flag;
        int result = numberOne % numberTwo;
        if (result == 0) {
            flag = true;
            System.out.println("El primer numero es divible por el segundo " + flag);
        } else {
            flag = true;
            System.out.println("El primer numero no es divisible por el segundo " + flag);
        }
    }
}


//other exercise

import java.util.Scanner;

public class ExerciseClass2{
    public static void main(String[] args) {
        System.out.println("Welcome let's calculate the largest of three numbers you enter");
        Scanner elScannerDePepe = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = elScannerDePepe.nextInt();
        System.out.println("Enter the second number: ");
        int numberTwo = elScannerDePepe.nextInt();
        System.out.println("Enter the third number:: ");
        int numberThree = elScannerDePepe.nextInt();
        if (numberOne > numberTwo) {
            if (numberOne > numberThree) {
                System.out.println("The largest number is: " + numberOne);
            } else {
                System.out.println("The largest number is: " + numberThree);
            }
        } else if (numberTwo > numberThree) {
            System.out.println("The largest number is: " + numberTwo);
        }else {
            System.out.println("El mayor numero es el: " + numberThree);
        }

    }
}

//Prime Numbers

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        System.out.println("Welcome, we are going to identify in this program the prime numbers ");
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        boolean prime = true;
        int number = scann.nextInt();
        for(int i = 2; i <= number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
            else prime = true;
        }

        Syste
        m.out.println("The result of a prime number is : " + prime );

    }
}



//String Exercise
import java.util.Scanner;

public class StringComparations {
    public static void main(String[] args) {

        // Two strings that have the same content.
        // They should be the same, right true or false?
        System.out.println("****\n\tProgram that tells you if a string is the same or different from another string\n\tRosmy.me/blog\n****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String stringOne = sc.nextLine();
        System.out.println("Enter another string: ");
        String stringTwo = sc.nextLine();
        boolean flag;
        int resultado = stringOne.compareTo(stringTwo);
        if(resultado == 0){
            flag = false;
            System.out.println("The chains are the same :-)"+ flag);
        }else{
            flag = true;
            System.out.println("The chains are not the same :("+ flag);
        }
    }
}
