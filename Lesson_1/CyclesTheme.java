import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1 ВЫВОД ASCII-СИМВОЛОВ\n");
        System.out.printf("%s%12s%14s", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int symbolCode = 33; symbolCode <= 122; symbolCode += 2) {
            System.out.printf("%n%4d%11c%7s%-1s", symbolCode, symbolCode, "",
                    Character.getName(symbolCode));
            if (symbolCode == 47) {
                symbolCode = 96;
            }
        }
        System.out.println("\n\n2 ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");

        String rectRow = "----------";
        for (int i = 1; i <= 5; i++) {
            System.out.print(rectRow);

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

        System.out.println("\n3 ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ\n");
        System.out.println("""
                   |  2  3  4  5  6  7  8  9
                ---+------------------------""");

        for (int row = 2; row <= 9; row++) {
            System.out.printf("%2d |", row);
            for (int col = 2; col <= 9; col++) {
                System.out.printf("%3d", col * row);
            }

            System.out.println();
        }

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК\n");
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
            for (int i = 0; i < (5 - count); i++) {
                System.out.printf("%3d", 0);
            }
            System.out.println();
        }

        System.out.println("\n5 ВЫВОД ЧИСЕЛ МЕЖДУ MIN & MAX\n");

        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.print("Интервал (" + min + ", " + max + ") в порядке убывания: ");

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n6 РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ");

        System.out.println();
        int srcNum = 2234321;
        int currNum = srcNum;
        int reversedNum = 0;
        int twosCount = 0;

        while (currNum > 0) {
            int digit = currNum % 10;
            if (digit == 2) twosCount++;
            reversedNum = reversedNum * 10 + digit;
            currNum /= 10;
        }

        String palindromeStatus = (srcNum == reversedNum) ? "палиндром" : "не палиндром";
        String twosParity = (twosCount % 2 == 0) ? "четным" : "нечетным";

        System.out.printf("%d - %s с %s (%d) количеством двоек%n", 
                srcNum, palindromeStatus, twosParity, twosCount);

        System.out.println("\n7 ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА\n");

        int luckyNum = 101002;
        int rightHalf = luckyNum % 1000;
        int leftHalf = luckyNum / 1000;

        int sumLeft = 0;
        int sumRight = 0;
        int tempLeft = leftHalf;
        int tempRight = rightHalf;

        for (int i = 0; i < 3; i++) {
            sumLeft += tempLeft % 10;
            tempLeft /= 10;
            sumRight += tempRight % 10;
            tempRight /= 10;
        }

        String luckiness = (sumLeft == sumRight) ? "счастливое число" : "несчастливое число";
        System.out.printf("%d - %s%n", luckyNum, luckiness);
        System.out.printf("Сумма цифр %03d = %d%n", leftHalf, sumLeft);
        System.out.printf("Сумма цифр %03d = %d%n", rightHalf, sumRight);

        System.out.println("\n8 ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ\n");

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