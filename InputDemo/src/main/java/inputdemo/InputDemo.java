/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdemo;
import java.util.Scanner;

/**
 *
 * @author echernenko
 */
public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int myInt = input.nextInt();
        System.out.printf("You entered %d.%n%n", myInt);
        
        System.out.print("Enter an double: ");
        double myDouble = input.nextDouble();
        System.out.printf("You entered %.2f.%n%n", myDouble);
        
        System.out.print("Enter a string: ");
        input.nextLine();
        String myString = input.nextLine();
        System.out.printf("You entered \"%s\".%n%n", myString);
        
    }
}
