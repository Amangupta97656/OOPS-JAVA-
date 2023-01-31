class Vehicle
{
   public void dispaly_Vehicle()
    {
        System.out.println("this is vehicle");
    }
}
class car extends Vehicle
{
    void dispaly_car()
    {
        System.out.println("vehicle's type is car");
    }
}

class main{
    public static void main(String []args)
    {
        car c = new car();
        c.dispaly_Vehicle();
        c.dispaly_car();
    }
}