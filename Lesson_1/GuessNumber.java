import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int rndNum = rnd.nextInt(1, 101);
        System.out.println("\n--- ИГРА: УГАДАЙ ЧИСЛО ---");
        System.out.println("Загадал число от 1 до 100. Попробуй угадать!");

        while (true) {
            System.out.print("Введите ваш вариант: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next(); 
            }

            int playerNum = scanner.nextInt();

            if (playerNum <= 0) {
                System.out.println("Вы ввели число меньше 0 или 0");
                continue;
            } else if (playerNum > 100) {
                System.out.println("вы ввели число больше 100");
                continue;
            }

            if (playerNum < rndNum) {
                System.out.println("Мое число БОЛЬШЕ чем " + playerNum);
            } else if (playerNum > rndNum) {
                System.out.println("Мое число МЕНЬШЕ чем " + playerNum);
            } else {
                System.out.println("ПОЗДРАВЛЯЮ! Ты угадал число " + rndNum);
                break;
            }
        }
    }
}