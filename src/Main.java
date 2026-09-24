import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name (String only or my program breaks)");
        String name = scan.nextLine();
        System.out.println("Hello, "+name+"!");

        System.out.println("Enter an integer!");
        int num1 = scan.nextInt();

        System.out.println("Enter another integer!");
        int num2 = scan.nextInt();

        System.out.println("Enter a third integer!");
        int num3 = scan.nextInt();

        System.out.println("The average of your three numbers is...");
        double average = (num1 + num2 + num3) / 3.0;

        System.out.println(average+"!");
    }
}