import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        String input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        RewardValue rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

class RewardValue
{
    private double cash,  miles;

    RewardValue(double cash)
    {
        this.cash=cash;
        //this.miles=miles;
    }

   public double getCashValue()
   {
        cash=miles/0.0035;
        return cash;
   }

   public double getMilesValue()
   {
        miles=cash*0.0035;
        return miles;
   }
}