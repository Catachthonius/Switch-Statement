package SwitchStatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        while (true){
            System.out.println("Input Number from 1 to 10");
            int number = inputNumber.nextInt();

            switch(number){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.println("Cannot give you the name");
            }
        }
    }
}
