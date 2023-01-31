
package employees;
import java.util.*;


class Employee{
    int emp_id,mobile_no;
    String emp_name,address,mail_id;
    Scanner get = new Scanner(System.in);
    Employee(){
        System.out.println("enter the name of employee: ");
        emp_name = get.nextLine();
        System.out.println("enter mail id: ");
        mail_id = get.nextLine();
        System.out.println("enter the address: ");
        address = get.nextLine();
        System.out.println("enter the emp id: ");
        emp_id = get.nextInt();
        System.out.println("enter the mobile no: ");
        mobile_no = get.nextInt();
        
    }
    
    void display(){
        System.out.println("employee id: "+emp_id);
        System.out.println("employee name: "+emp_name);
        System.out.println("phone number: " +mobile_no);
        System.out.println("mail id: "+mail_id);
        System.out.println("address: "+address);
        
    }
    
}
class Programmer extends Employee{
    float bp,salary,hra,da,swf,pf;
    Programmer(){
        System.out.println("enter the basic pay: ");
        bp = get.nextFloat();
        hra = bp*10/100;
        da = bp*97/100;
        pf = bp*12/100;
        swf = (float)(bp*0.1/100);
         salary = bp + hra+da-pf-swf;
    }
    
    void display(){
        System.out.println("programmer details: ");
        super.display();
        System.out.println("basic pay: "+bp);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("P F: "+pf);
        System.out.println("SWF: "+swf);
        System.out.println("salary: "+salary);
    }
}

class Assistprof extends Employee{
    float bp,salary,hra,da,swf,pf;
    Assistprof(){
        System.out.println("enter the basic pay: ");
        bp = get.nextFloat();
        hra = bp*10/100;
        da = bp*97/100;
        pf = bp*12/100;
        swf = (float)(bp*0.1/100);
         salary = bp + hra+da-pf-swf;
    }

    void display(){
        System.out.println("Assistant professor details: ");
        super.display();
        System.out.println("basic pay: "+bp);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("P F: "+pf);
        System.out.println("SWF: "+swf);
        System.out.println("salary: "+salary);
    }
}
class Assoprof extends Employee{
    float bp,salary,hra,da,swf,pf;
    Assoprof(){
        System.out.println("enter the basic pay: ");
        bp = get.nextFloat();
        hra = bp*10/100;
        da = bp*97/100;
        pf = bp*12/100;
        swf = (float)(bp*0.1/100);
        salary = bp + hra+da-pf-swf;
    }
    
    void display(){
        System.out.println("associate professor details: ");
        super.display();
        System.out.println("basic pay: "+bp);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("P F: "+pf);
        System.out.println("SWF: "+swf);
        System.out.println("salary: "+salary);
    }
}
class Professor extends Employee{
    float bp,salary,hra,da,swf,pf;
    Professor(){
        System.out.println("enter the basic pay: ");
        bp = get.nextFloat();
        hra = bp*10/100;
        da = bp*97/100;
        pf = bp*12/100;
        swf = (float)(bp*0.1/100);
         salary = bp + hra+da-pf-swf;
    }
    void diplay(){
        System.out.println("professor details: ");
        super.display();
        System.out.println("basic pay: "+bp);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("P F: "+pf);
        System.out.println("SWF: "+swf);
        System.out.println("salary: "+salary);
    }
}

public class Employees {

   
    public static void main(String[] args) {
        System.out.println("enter the programmer details: ");
        Programmer obj1 = new Programmer();
        obj1.display();
        Assistprof obj2 = new Assistprof();
        obj2.display();
        Assoprof obj3 = new Assoprof();
        obj3.display();
        Professor obj4 = new Professor();
        obj4.diplay();
        
    }
    
}
