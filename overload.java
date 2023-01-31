/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;



interface JavaApplication23  {
    int a=50;
    int b=30;
    void add();
    void sub();
}
class Overload_demo implements JavaApplication23 {
    @Override
    public void add(){
        System.out.println("addition of"+a+"and"+b+"is"+(a+b));
    }
    @Override
    public void sub(){
        System.out.println("substraction of"+a+"and"+b+"is"+(a-b));
    }
    
    
    public static void main(String[] args) {
       Overload_demo obj = new Overload_demo();
       obj.add();
       obj.sub();
    }
    
}

    
