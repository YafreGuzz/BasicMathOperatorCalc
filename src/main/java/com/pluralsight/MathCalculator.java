package com.pluralsight;
import java.util.Scanner;

public class MathCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("Operator: ");
            String operator = scanner.nextLine();
            System.out.println("Enter first value:");
            int value1 = scanner.nextInt();
            System.out.println("Enter second value:");
            int value2 = scanner.nextInt();

            switch (operator)
            {
                case "+":
                    System.out.printf("%d + %d = ", value1, value2);
                    System.out.print(value1 + value2);
                    break;
                case "-":
                    System.out.printf("%d - %d = ", value1, value2);
                    System.out.println(value1 - value2);
                    break;
                case "*":
                    System.out.printf("%d * %d = ", value1, value2);
                    System.out.println(value1 * value2);
                    break;
                case "/":
                    System.out.printf("%d / %d = ", value1, value2);
                    System.out.println(value1 / value2);
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println("Please select +,-,*,/.");
        }
    }
}
