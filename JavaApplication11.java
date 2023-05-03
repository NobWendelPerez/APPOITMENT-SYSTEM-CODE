/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;
/**
 *
 * @author BONBON
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner in =new Scanner(System.in);
        
        System.out.print("input first number: ");
        int num1 = in.nextlnt();
        
        System.out.print("Input second number; ");
        int num2 = in.nextlnt();
        
        System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
                
    }
    
}
    
}
