import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        System.out.println("Please enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        double result = 0;

        while (true) {
            if (operator == '+')
                result = firstNumber + secondNumber;
            else if (operator == '-')
                result = firstNumber - secondNumber;
            else if (operator == '*')
                result = firstNumber * secondNumber;
            else if (operator == '/')
                result = firstNumber / secondNumber;
            else if (operator == '%')
                result = firstNumber % secondNumber;
            else {
                System.out.println("There is no proper operator. Try again");
                break;
            }
            System.out.println("Answer is: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
            break;
        }

    }
}
