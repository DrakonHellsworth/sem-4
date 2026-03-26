//Design an abstract class Appliance with method powerConsumption().Implement subclasses Fan, AC, and Refrigerator.Compute total power consumption using dynamic binding.
import java.util.Scanner;
abstract class Appliance
{
    abstract double powerConsumption();
}
class Fan extends Appliance
{    double power;
    Fan(double power)
    {
        this.power=power;
    }
    double powerConsumption()
    {
        return power;
    }
}
class AC extends Appliance
{    double power;
    AC(double power)
    {
        this.power=power;
    }
    double powerConsumption()
    {
        return power;
    }
}
class Refrigerator extends Appliance
{    double power;
    Refrigerator(double power)
    {
        this.power=power;
    }
    double powerConsumption()
    {
        return power;
    }
}
public class exe6_16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter power consumption of fan: ");
        double fanPower=sc.nextDouble();
        System.out.print("Enter power consumption of AC: ");
        double acPower=sc.nextDouble();
        System.out.print("Enter power consumption of refrigerator: ");
        double fridgePower=sc.nextDouble();
        Appliance appliances[]=new Appliance[3];
        appliances[0]=new Fan(fanPower);
        appliances[1]=new AC(acPower);
        appliances[2]=new Refrigerator(fridgePower);
        double totalPower=0;
        for(Appliance a: appliances)
        {
            totalPower+=a.powerConsumption();
        }
        System.out.println("Total power consumption: "+totalPower+" watts");
    }
}
//Observation: In the above code, we have an abstract class Appliance with an abstract method powerConsumption(). The subclasses Fan, AC, and Refrigerator extend Appliance and override powerConsumption() to return their respective power consumption values. In the main method, we take user input for the power consumption of each appliance, create an array of Appliance references holding Fan, AC, and Refrigerator objects, and iterate over it to calculate the total power consumption. This demonstrates runtime polymorphism as the correct overridden method is called based on the actual object type at runtime, allowing us to compute the total power consumption dynamically.