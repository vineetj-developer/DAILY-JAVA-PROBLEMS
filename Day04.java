import java.util.Scanner;

public class Day04 {
    public static void main(String args[]) {
        int num1, num2;
        System.out.println("Enter your first number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();
        System.out.println("Sum of these number : " + (num1 + num2));
    }
}
