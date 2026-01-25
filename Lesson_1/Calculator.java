import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число. Оно должно быть натуральным (больше 0):");
        int num1;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Это не целое число. Повторите ввод:");
                scanner.next();
            }
            num1 = scanner.nextInt(); 
            if (num1 > 0) {
                break;
            } else {
                System.out.println("Ошибка! Число должно быть больше 0. Повторите ввод:");
            }
        }
        System.out.println("Введите второе число. Оно должно быть натуральным (больше 0):");
        int num2;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Это не целое число. Повторите ввод:");
                scanner.next();
            }
            num2 = scanner.nextInt();
            if (num2 > 0) {
                break;
            } else {
                System.out.println("Ошибка! Число должно быть больше 0. Повторите ввод:");
            }
        }
        System.out.println("Вы успешно ввели числа: " + num1 + " и " + num2);
        System.out.println("Введите символ математической операции + , - , *, /, %, ^,");
        char action = scanner.next().charAt(0);;
        while (action != '+' && action != '-' &&
            action != '*' && action != '/' && action != '%' && action != '^') {
            System.out.println("Ошибка! Введите один из предложенных знаков + , - , *, /, %, ^,");
            action = scanner.next().charAt(0);;
        }
        System.out.println("Вы успешно выбрали знак " + action);
        int result = 0;
        if (action == '+') {
            result = num1 + num2;
        } else if (action == '-') {
            result = num1 - num2;
        } else if (action == '*') {
            result = num1 * num2;
        } else if (action == '/') {
            if (num2 == 0) {
                System.out.println("Ошибка: деление на ноль!");
                return;
            }
            result = num1 / num2;
        } else if (action == '%') {
            if (num2 == 0) {
                System.out.println("Ошибка: деление на ноль!");
                return;
            }
            result = num1 % num2;
        } else if (action == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        }
        System.out.println("Ваше вычисление: " + num1 + " " + action + " " + num2 + " = " + result);
    }
}
