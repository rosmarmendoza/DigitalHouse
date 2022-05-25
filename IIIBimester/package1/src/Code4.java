import java.util.Scanner;

public class Code4 {
    //Prime Numbers

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

        System.out.println("The result of a prime number is : " + prime );
    }
}

