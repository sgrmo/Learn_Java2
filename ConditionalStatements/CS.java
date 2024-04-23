package ConditionalStatements;

import java.util.Scanner;

public class CS {
    public static void main(String[] args) {
        // IF
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int i = sc.nextInt();
//        if(i>5)
//        {
//            System.out.println("Entered number is greater than 5");
//        }

        //IfElse

//        if(i>5)
//        {
//            System.out.println("Entered number is greater than 5");
//        }
//        else {
//            System.out.println("Entered number is not greater than 5");
//        }

        //ifelseif

        if(i>5)
        {
            System.out.println("Entered number is greater than 5");
        }
        else if(i==5){
            System.out.println("Entered number is equal to 5");
        }
        else {
            System.out.println("Entered number is not greater than 5");
        }
    }
}
