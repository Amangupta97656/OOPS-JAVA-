/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;
import java.util.*;
/**
 *
 * @author lenovo
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,number, fact=1;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=Sc.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("factorial is: "+fact);
    }
    
}
