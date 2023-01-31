/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average_of_three;
import java.util.*;

/**
 *
 * @author lenovo
 */
public class Average_Of_Three {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        int a,b,c;
        double sum,average;
        System.out.println("Enter first number: ");
        a=Sc.nextInt();
        System.out.println("Enter second number: ");
        b=Sc.nextInt();
        System.out.println("Enter third number: ");
        c=Sc.nextInt();
        sum=(a+b+c);
        average=sum/3;
        System.out.println("Average: " +average);
        
        
    }
    
}
