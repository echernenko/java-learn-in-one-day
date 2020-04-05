/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errordemo;
import java.util.Scanner;

/**
 *
 * @author echernenko
 */
public class ErrorDemo {
    public static void main(String[] args) {
        int num, deno;
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Please enter the numerator: ");
            num = input.nextInt();
            
            System.out.println("Please enter the denominator: ");
            deno = input.nextInt();
            
            System.out.println("The result is  " + num/deno);
        } catch (Exception e) {
             System.out.println(e.getMessage());
        } finally {
             System.out.println("---- End of Error Handling Example ----");
        }
    }
}