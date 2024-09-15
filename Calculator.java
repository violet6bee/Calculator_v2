import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner input1 = new Scanner(System.in);
        double number1 = input1.nextDouble();

        System.out.println("Введите один из перечисленных операторов +, -, *, /: ");
        Scanner input_op = new Scanner(System.in);
        String operator = input_op.next();

        System.out.println("Введите второе число: ");
        Scanner input2 = new Scanner(System.in);
        double number2 = input2.nextDouble();

        Result result = new Result();
        result.decisions(number1, operator, number2);
    }
}
