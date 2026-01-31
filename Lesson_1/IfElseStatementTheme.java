import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA\n");
        boolean isMale = true;

        if (!isMale) {
            System.out.println("Вы девушка.");
        } else {
            System.out.println("Вы мужчина.");
        }

        int age = 25;
        if (age > 18) {
            System.out.println("Вы старше 18");
        } else {
            System.out.println("Вы младше 18");
        }

        double height = 1.9;
        if (height < 1.8) {
            System.out.println("Ваш рост выше 1.8 м");
        } else {
            System.out.println("Ваш рост ниже 1.8 м");
        }

        System.out.println("\n2.ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ\n");

        int todayTakenSteps = 2;
        int yesterdayTakenSteps = 21;

        if (todayTakenSteps > yesterdayTakenSteps) {
            System.out.println("Сегодня вы прошли больше шагов, чем вчера");
        } else if (todayTakenSteps < yesterdayTakenSteps) {
            System.out.println("вчера вы прошли больше шагов чем сегодня");
        } else { 
            System.out.println("Сегодня вы прошли столько же шагов как и вчера");
        }

        System.out.println("\n3.ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ\n");
        int guestAmount = -6;

        if (guestAmount == 0) { 
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestAmount <= -1) {
            System.out.println("отрицательных гостей не бывает");
        } else if (guestAmount % 2 == 0) {
            System.out.println("четное число гостей");
        } else {
            System.out.println("нечетное число гостей");
        }

        System.out.println("\n 4.ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА\n");
        System.out.println("первый вариант решения задачи:\n");
 
        String nickName = ("*ke4inaTori*");
        char firstChar = nickName.charAt(0);
        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("никнейм " + nickName + " начинается с маленькой буквы " + firstChar);
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println("никнейм " + nickName + " начинается с большой буквы " + firstChar);
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println("никнейм " + nickName + " начинается с цифры " + firstChar);
        } else {
            System.out.println("никнейм " + nickName + " начинается с символа " + firstChar);
        }

        System.out.println("\nвторой вариант решения задачи\n");

        String nickName2 = ("*ke4inaTori*");
        char firstChar2 = nickName.charAt(0);
        if (Character.isLowerCase(firstChar2)) {
            System.out.println("никнейм " + nickName2 + " начинается с маленькой буквы " + firstChar2);
        } else if (Character.isUpperCase(firstChar2)) {
            System.out.println("никнейм " + nickName2 + " начинается с большой буквы " + firstChar2);
        } else if (Character.isDigit(firstChar2)) {
            System.out.println("никнейм " + nickName2 + " начинается с цифры " + firstChar2);
        } else {
            System.out.println("никнейм " + nickName2 + " начинается с символа " + firstChar2);
        }

        System.out.println("\n5.ИНВЕНТАРИЗАЦИЯ\n");
        int dataBaseSerialNumber = 431;
        int firstNum = (dataBaseSerialNumber / 10) % 10;
        int secondNum = dataBaseSerialNumber / 100;
        int thirdNum = dataBaseSerialNumber % 10;
        int officeSerialNumber = 567;
        int firstNum2 = (officeSerialNumber / 10) % 10;
        int secondNum2 = officeSerialNumber / 100;
        int thirdNum2 = officeSerialNumber % 10;

        if (dataBaseSerialNumber == officeSerialNumber) {
            System.out.println("компьютер на 3-м этаже в кабинете 2");
        } else if (firstNum != firstNum2 && secondNum != secondNum2 && thirdNum != thirdNum2) {
            System.out.println("оборудование не идентифицировано");
        } else {
            String temp1 = (firstNum == firstNum2) ? String.valueOf(firstNum) : "_";
            String temp2 = (secondNum == secondNum2) ? String.valueOf(secondNum) : "_";
            String temp3 = (thirdNum == thirdNum2) ? String.valueOf(thirdNum) : "_";
            System.out.println("неполное совпадение: %s %s %s".formatted(temp1, temp2, temp3));
        }

        System.out.println("\n6.ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %\n");
        System.out.println("Вариант 1"); 
        float deposit = 321123.79f;
        float percentPlus = 0;
        float sumPercents = 0;
        if (deposit < 100000f) {
            percentPlus = deposit * 0.05f;
        } else if (deposit == 100000f || deposit <= 300000f) {
            percentPlus = deposit * 0.07f;
        } else {
            percentPlus = deposit * 0.10f;
        } 
        sumPercents = (deposit + percentPlus);
        System.out.println("""

                Начальный депозит: %f
                сумма начисленного процента: %f
                итоговая сумма: %f
                """.formatted(deposit, percentPlus, sumPercents));

        System.out.println("Вариант 2");

        BigDecimal depositBd = new BigDecimal("321123.79");
        BigDecimal percentPlusBd;
        BigDecimal sumPercentsBd;
        BigDecimal limit100k = new BigDecimal("100000");
        BigDecimal limit300k = new BigDecimal("300000");

        if (depositBd.compareTo(limit100k) < 0) {
            percentPlusBd = depositBd.multiply(new BigDecimal("0.05"));
        } else if (depositBd.compareTo(limit300k) <= 0) {
            percentPlusBd = depositBd.multiply(new BigDecimal("0.07"));
        } else {
            percentPlusBd = depositBd.multiply(new BigDecimal("0.10"));
        }

        percentPlusBd = percentPlusBd.setScale(2, RoundingMode.HALF_UP);

        sumPercentsBd = depositBd.add(percentPlusBd);

        System.out.println("""

                Начальный депозит: %s
                Сумма начисленного процента: %s
                Итоговая сумма: %s
                """.formatted(depositBd, percentPlusBd, sumPercentsBd));

        System.out.println("\n7.ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ\n");

        int historyMarkPercent = 59;
        String printHistoryMark = "";
        int historyMark = 0;
        if (historyMarkPercent <= 60) {
            printHistoryMark = ("История: оценка - 2");
            historyMark = 2;
        } else if (historyMarkPercent >= 60 && historyMarkPercent <= 73) {
            printHistoryMark = ("История: оценка - 3");
            historyMark = 3;
        } else if (historyMarkPercent >= 73 && historyMarkPercent <= 91) {
            printHistoryMark = ("История: оценка - 4");
            historyMark = 4;
        } else {
            printHistoryMark = ("История: оценка - 5");
            historyMark = 5;
        }

        int programmingMarkPercent = 92;
        int programmingMark = 0;
        String printProgrammingMark = "";

        if (programmingMarkPercent <= 60) {
            printProgrammingMark = ("программирование: оценка - 2");
            programmingMark = 2;
        } else if (programmingMarkPercent >= 60 && programmingMarkPercent <= 73) {
            printProgrammingMark = ("программирование: оценка - 3");;
            programmingMark = 3;
        } else if (programmingMarkPercent >= 73 && programmingMarkPercent <= 91) {
            printProgrammingMark = ("программирование: оценка - 4");;
            programmingMark = 4;
        } else {
            printProgrammingMark = ("программирование: оценка - 5");
            programmingMark = 5;
        }

        double middleNumMark = (historyMark + programmingMark) / 2.0;
        double middlePercentMark = (programmingMarkPercent + historyMarkPercent) / 2.0;
        System.out.println("""
                %s
                %s
                Средняя оценка: %f
                Средний процент: %f
                """.formatted(printHistoryMark, printProgrammingMark,
                    middleNumMark, middlePercentMark));

        System.out.println("\n8.РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ\n");
        BigDecimal salesPerMonth = new BigDecimal(13025.233);
        BigDecimal rentPayment = new BigDecimal(5123.018);
        BigDecimal manufactureSelfCost = new BigDecimal(9001.729);
        BigDecimal profitPerYear = salesPerMonth
                .subtract(manufactureSelfCost)
                .subtract(rentPayment)
                .multiply(new BigDecimal(12));
        profitPerYear = profitPerYear.setScale(2, RoundingMode.HALF_UP);
        char plusMinusSign = (profitPerYear.compareTo(BigDecimal.ZERO) >= 0) ? '+' : '-';
        System.out.println(" прибыль за год: %s".formatted(profitPerYear));
    }
}