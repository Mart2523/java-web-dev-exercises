package exercises;
import java.util.Scanner;
public class Mpg {
    public static void main(String[] args) {
        double miles;
        double gas;
        double mpg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles you've drove: ");
        miles = input.nextDouble();
        System.out.println("Enter the amount of gas in gallons you've used ");
        gas = input.nextDouble();
        input.close();
        mpg = miles/gas;
        System.out.println("The MPG: " + mpg);

    }
}