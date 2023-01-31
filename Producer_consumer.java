/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buffer;


public class Buffer {
    int a;
    boolean produced = false;
    public synchronized void produce(int x)
    { 
        if(produced)
        {System.out.println("producer is waitng");
        try{
            wait();
        }
        catch(exception e)
        {
            System.out.println(e);
        }
    }
a = x;
        System.out.println("product " +a+ "is is produced ");
        produced = true;
        notify();
    }
    
    public synchronized void comsue(){
        if(!produced)
            System.out.println("consumer is waiting");
        try{
            wait();
        }
        catch(exception e)
        {
            System.out.println(e);
        
    
    System.out.println("product"+a+"is consumed");
    produced = false;
    notify();
        }
    }
    class producer extends Thread{
        Buffer b;
    public producer(Buffer b){
        this.b =b;
        
    }
    public void run()
    {
        System.out.println("producer start producing");
        for(int i=1;i<=3;i++){
            b.produce(i);
            
        }
    }
    }
    class consumer extends Thread{
        Buffer b;
        public consumer(Buffer b){
            this.b=b;
            
        }
        public void run({
            System.out.println("consumer start consuming");
            for(int i=1;i<=3;i++){
                b.consumer();
            }
        }
    }
    public class producer consumer Example{
    public static void main(String[] args) {
        Buffer b = new Buffer();
        producer p = new producer(b);
        consumer c = new consumer(b);
        p.start();
        c.start();
    }
    
}
