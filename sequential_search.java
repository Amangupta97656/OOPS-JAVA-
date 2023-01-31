/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequential_search;
import java.util.*;


public class Sequential_search {

    
    public static void main(String[] args) {
       int n,key ;
       int arr[] = {40,30,10,20,5};
       n= arr.length;
        
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the key to be search: ");
        key = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(arr[i]==key)
                System.out.println("element is found at position: "+i);
        }
       
       
    }
    
}
