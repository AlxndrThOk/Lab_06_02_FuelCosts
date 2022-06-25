import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallonsOfGas;
        double fuelEfficiency;
        double costOfGas;
        double costFor100Miles;
        double currentDistance;
        System.out.println("Gallons of gas?");
        if (in.hasNextDouble())
        {
            gallonsOfGas = in.nextDouble();
            System.out.println("Fuel efficiency?");
            if (in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                System.out.println("Cost of gas per gallon?");

                if (in.hasNextDouble())
                {
                    costOfGas = in.nextDouble();

                    costFor100Miles = costOfGas / fuelEfficiency * 100;
                    currentDistance = gallonsOfGas * fuelEfficiency;
                    System.out.println("It would cost this much to travel 100 miles:");
                    System.out.printf("%5.2f\n", costFor100Miles);
                    System.out.println("You could travel " + currentDistance + " miles right now");
                }
                else
                {
                    System.out.println("invalid entry");
                }
            }
            else
            {
                System.out.println("invalid entry");
            }
        }
        else
        {
            System.out.println("invalid entry");
        }
    }
}