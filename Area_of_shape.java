/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaofshape;


abstract class Shape{
     int x=10,y=15;
     abstract void printArea();
}
class Rectangle extends Shape{
    @Override
    public void printArea(){
        float area;
        area =x*y;
        System.out.println("Area of Reactangle: "+area);
    }
}
class Triangle extends Shape{
    @Override
    public void printArea(){
        float area;
        area =(x*y)/2.0f;
        System.out.println("Area of triangle: "+area);
    }
}
class Circle extends Shape{
    @Override
    public void printArea(){
        float area = (22*x*x)/7.0f;
        System.out.println("Area of circle: "+area);
    }
} 

public class Areaofshape {

    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        r.printArea();
        t.printArea();
        c.printArea();
        
    }
    
}
