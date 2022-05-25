import java.util.Scanner;
//Program that shows if we have a number that is divisible by another number.

public class Code3 {

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
