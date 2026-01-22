import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("""

        1 ВЫВОД ASCII-СИМВОЛОВ
                    """); 
        System.out.printf("%-10s %-10s %-20s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int oddNum = 33; oddNum <= 47; oddNum++) {
            if (oddNum % 2 != 0) {
                System.out.printf("%3d         %-11c %s%n", oddNum, (char) oddNum, Character.getName(oddNum));
            }
        }
        for (char lowCaseLetter = 'a'; lowCaseLetter <= 'z'; lowCaseLetter++) {
            if (lowCaseLetter % 2 == 0) {
                System.out.printf("%3d         %-11c %s%n",
                        (int) lowCaseLetter, (char) lowCaseLetter, Character.getName(lowCaseLetter));
            }
        }

        System.out.println("""

2 ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР

                    """);
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("-");
            }
            System.out.print(" ");
            for (int j = 0; j < (6 - i); j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        System.out.println("""

        3 ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ

                    """);
        System.out.print("   |");
        for (int raws = 2; raws <= 9; raws++) {
            System.out.printf("%3d", raws);
        }
        System.out.println();
        System.out.println("---+------------------------");
        for (int lines = 2; lines <= 9; lines++) {
            System.out.printf("%2d |", lines);
            for (int raws = 2; raws <= 9; raws++) {
                System.out.printf("%3d", raws * lines);
            }
            System.out.println();
        }
        System.out.println("""

4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК

                    """);
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
        if (count > 0) {
            for (int j = 0; j < (5 - count); j++) {
                System.out.printf("%3d", 0);
            }
            System.out.println();
        }
        System.out.println("""

        5 Вывод чисел между Min и Max

                    """);

        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Интервал (" + min + ", " + max + ") в порядке убывания:");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int srcNum = 2234321;
        int tempNum = srcNum;
        int reverseNum = 0;
        int twosCount = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            if (digit == 2) twosCount++;
            reverseNum = reverseNum * 10 + digit;
            tempNum /= 10;
        }

        String palindromeStatus = (srcNum == reverseNum) ? "палиндром" : "не палиндром";
        String twosParity = (twosCount % 2 == 0) ? "четным" : "нечетным";

        System.out.printf("%d - %s с %s (%d) количеством двоек%n", 
                srcNum, palindromeStatus, twosParity, twosCount);

        System.out.println("""

Проверка счастливого числа 101002

                    """);

        int luckyNum = 101002;
        int rightPart = luckyNum % 1000; // 002
        int leftPart = luckyNum / 1000;  // 101

        int sumLeft = 0;
        int sumRight = 0;
        int tempLeft = leftPart;
        int tempRight = rightPart;

        for (int i = 0; i < 3; i++) {
            sumLeft += tempLeft % 10;
            tempLeft /= 10;
            sumRight += tempRight % 10;
            tempRight /= 10;
        }

        String result = (sumLeft == sumRight) ? "счастливое число" : "несчастливое число";
        System.out.printf("%d - %s%n", luckyNum, result);
        System.out.printf("Сумма цифр %03d = %d%n", leftPart, sumLeft);
        System.out.printf("Сумма цифр %03d = %d%n", rightPart, sumRight);

        System.out.println("""

Простой генератор пароля

                    """);

        Random rnd = new Random();
        String password = "";
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < 8; i++) {
            char ch = (char) rnd.nextInt(33, 127);
            password += ch;

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
        String reliability = "Слабый";
        if (password.length() >= 8) {
            if (hasUpper && hasLower && hasSpecial) {
                reliability = "Надежный";
            } else if (hasUpper || hasDigit) {
                reliability = "Средний";
            }
        }
        System.out.println("Пароль: " + password);
        System.out.println("Надежность: " + reliability);
    }
}