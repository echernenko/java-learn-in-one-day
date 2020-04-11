/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymethoddemo;

/**
 *
 * @author echernenko
 */
public class MyClass {

    public void printFirstElement(int[] a) { 
        System.out.println("The first element is " + a[0]); 
    }

    public int[] returnArray() { 
        int[] a = new int[3]; 
        for (int i = 0; i < a.length; i++) 
        { 
            a[i] = i*2; 
        } 
        return a; 
    } 

    public void passPrimitive(int primitivePara)
    {
        primitivePara = 10;
        System.out.println("Value inside method = " + primitivePara);
    }

    public void passReference(int[] refPara)
    {
        refPara[1] = 5;
        System.out.println("Value inside method = " + refPara[1]);
    }

}