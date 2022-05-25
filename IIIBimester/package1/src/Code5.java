import java.util.Scanner;

public class Code5 {
    //String Exercise
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

