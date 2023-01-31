/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception_handling;


public class Exception_handling {

    
    public static void main(String[] args) {
        
        try{
        int x =10, y =0;
            int c = x/y;
        
            System.out.println(c);
            
        }
        catch(Exception e)
                {
                    System.out.println("can't divide by zero");
                }
    }
    
}
