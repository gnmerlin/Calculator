import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the two numbers for addition:");
        Scanner readNumber = new Scanner(System.in);
        int a = readNumber.nextInt();
        int b = readNumber.nextInt();
        System.out.println("The sum of the numbers is " + Integer.sum(a, b));

    }
}