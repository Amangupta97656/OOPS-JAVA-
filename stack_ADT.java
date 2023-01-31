/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_adt;


public class Stack_ADT {
private final int arr[];
private int top;
private final int capacity;
Stack_ADT (int size){
 arr = new int[size];
 capacity = size;
 top = -1;
}
public void push(int x){
    if(isFull()){
        System.out.println("over flow \n program terminated \n");
        System.exit(1);
    }
    System.out.println("inserting: "+x);
    arr[++top]=x;
    
}
public int pop(){
    if(isEmpty ()){
        System.out.println("STACK EMPTY");
        System.exit(1);
        
    }
    return arr[top--];
}
public int size(){
    return top+1;
}
    public Boolean is_empty(){
        return top == -1;
        
        
    }
    public Boolean is_Full(){
        return top == capacity -1;
        
    }
    public void printstack(){
        for(int i=0; i<=top;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Stack_ADT stack = new Stack_ADT(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println("\n after poping out");
        stack.printstack();
    }

    private boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}