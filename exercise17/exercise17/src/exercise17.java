import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args)
    {
        //INPUT ONE
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a 1 is you are male or a 2 if you are female: ");
        //checking if input is a number
        if(!(input.hasNextDouble()))
        {
            System.out.println("That is not a valid number. Try again.");
            return;
        }
        String gender = input.next();
        int convGender = Integer.parseInt(gender);

        //INPUT TWO
        Scanner input2 = new Scanner (System.in);
        System.out.println("How many ounces of alcohol did you have?");
        //checking if input2 is a number
        if(!(input2.hasNextDouble()))
        {
            System.out.println("That is not a valid number. Try again.");
            return;
        }
        String ounces = input2.next();
        double convOunces = Double.parseDouble(ounces);

        //INPUT THREE
        Scanner input3 = new Scanner (System.in);
        System.out.println("What is your weight, in pounds?");
        //checking if input2 is a number
        if(!(input3.hasNextDouble()))
        {
            System.out.println("That is not a valid number. Try again.");
            return;
        }
        String weight = input3.next();
        int convWeight = Integer.parseInt(weight);

        //INPUT FOUR
        Scanner input4 = new Scanner (System.in);
        System.out.println("How many hours has it been since your last drink?");
        //checking if input2 is a number
        if(!(input4.hasNextDouble()))
        {
            System.out.println("That is not a valid number. Try again.");
            return;
        }
        String hours = input4.next();
        int convHours = Integer.parseInt(hours);

        double r = 0;
        if(convGender == 1)
        {
            r = 0.73;
        }
        else
        {
            r = 0.66;
        }

        //simplifying the math
        double math1 = (convOunces * 5.14/convWeight * r);
        double math2 = (.015 * convHours);
        double BAC = math1 - math2;

        System.out.println("Your BAC is "+String.format("%.6f",BAC));
        if(BAC >= .08 )
        {
          System.out.println("It is not legal for you to drive.");
        }
        else
        {
            System.out.println("It is legal for you to drive.");
        }

    }
}

