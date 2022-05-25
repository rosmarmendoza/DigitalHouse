import java.util.Scanner;

public class Code6 {
    //other exercise

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


