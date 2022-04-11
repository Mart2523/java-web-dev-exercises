package exercises;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        double length;
        double height;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = input.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        height = input.nextDouble();
        input.close();
        area = length * height;
        System.out.println("The area of the rectangle is: " + area);

    }
}
