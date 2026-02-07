import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA");
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

        System.out.println("\n2.ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ");

        int todaySteps = 2500;
        int yesterdaySteps = 3000;
        double averageSteps = (todaySteps + yesterdaySteps) / 2.0;
        String result = "";

        if (todaySteps > yesterdaySteps) {
            result = "Сегодня вы прошли больше, чем вчера";
        } else if (todaySteps < yesterdaySteps) {
            result = "Вчера вы прошли больше, чем сегодня";
        } else {
            result = "Сегодня вы прошли столько же, сколько вчера";
        }

        System.out.println("""
                Шаги за сегодня: %d
                Шаги за вчера:   %d
                ---------------------------
                Сравнение количества шагов: %s
                Среднее за 2 дня: %.2f
                """.formatted(todaySteps, yesterdaySteps, result, averageSteps));

        System.out.println("\n3.ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ");
        int guestAmount = -6;

        if (guestAmount == 0) { 
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guestAmount < 0) {
            System.out.println("Ошибка: отрицательное количество гостей");
        } else if (guestAmount % 2 == 0) {
            System.out.println("четное число гостей");
        } else {
            System.out.println("нечетное число гостей");
        }

        System.out.println("\n4.ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА");
        System.out.println("\nпервый вариант решения задачи:");

        String nickName = ("*ke4inaTori*");
        char firstChar = nickName.charAt(0);
        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println(nickName + " начинается с маленькой буквы " + firstChar);
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println(nickName + " начинается с большой буквы " + firstChar);
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println(nickName + " начинается с цифры " + firstChar);
        } else {
            System.out.println(nickName + " начинается с символа " + firstChar);
        }

        System.out.println("\nвторой вариант решения задачи");

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

        System.out.println("\n5. ИНВЕНТАРИЗАЦИЯ");

        int dbSerialNumber = 461;
        int officeSerialNumber = 567;

        int dbHundreds = dbSerialNumber / 100;
        int dbTens = (dbSerialNumber / 10) % 10;
        int dbOnes = dbSerialNumber % 10;

        int officeHundreds = officeSerialNumber / 100;
        int officeTens = (officeSerialNumber / 10) % 10;
        int officeOnes = officeSerialNumber % 10;

        if (dbSerialNumber == officeSerialNumber) {
            System.out.println("Компьютер на 3-м этаже в кабинете 2");
        } else {
            String resHundreds = (dbHundreds == officeHundreds) ? String.valueOf(dbHundreds) : "_";
            String resTens = (dbTens == officeTens) ? String.valueOf(dbTens) : "_";
            String resOnes = (dbOnes == officeOnes) ? String.valueOf(dbOnes) : "_";

            if (resHundreds.equals("_") && resTens.equals("_") && resOnes.equals("_")) {
                System.out.println("Оборудование не идентифицировано");
            } else {
                System.out.println("""
                        Выявлено неполное совпадение серийных номеров:%s%s%s
                        """.formatted(resHundreds, resTens, resOnes));
            }
        }

        System.out.println("\n6.ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %");
        System.out.println("\nВариант 1"); 
        float deposit = 321123.79f;

        float interestRate = 0.10f;
        if (deposit < 100000f) {
            interestRate = 0.05f;
        } else if (deposit <= 300000f) {
            interestRate = 0.07f;
        }

        float accruedInterest = deposit * interestRate;
        float totalAmount = deposit + accruedInterest;

        System.out.println("""
                Начальный депозит: %.2f
                Сумма начисленного процента: %.2f
                Итоговая сумма: %.2f
                """.formatted(deposit, accruedInterest, totalAmount));

        System.out.println("Вариант 2");

        BigDecimal depositBd = new BigDecimal("321123.79");

        BigDecimal interestRateBd;
        if (depositBd.compareTo(new BigDecimal("100000")) < 0) {
            interestRateBd = new BigDecimal("0.05");
        } else if (depositBd.compareTo(new BigDecimal("300000")) <= 0) {
            interestRateBd = new BigDecimal("0.07");
        } else {
            interestRateBd = new BigDecimal("0.10");
        }

        BigDecimal accruedInterestBd = depositBd.multiply(interestRateBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalBalanceBd = depositBd.add(accruedInterestBd);

        System.out.println("""
                Сумма вклада: %s
                Сумма начисленного %%: %s
                Итоговая сумма: %s
                """.formatted(depositBd, accruedInterestBd, totalBalanceBd));

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ");
        int historyPercent = 59;
        int historyMark = 5;

        if (historyPercent <= 60) {
            historyMark = 2;
        } else if (historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent <= 91) {
            historyMark = 4;
        }

        int programmingPercent = 92;
        int programmingMark = 5;

        if (programmingPercent <= 60) {
            programmingMark = 2;
        } else if (programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent <= 91) {
            programmingMark = 4;
        }

        double averageMark = (historyMark + programmingMark) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("""
                История: оценка - %d
                Программирование: оценка - %d
                Средняя оценка: %.1f
                Средний процент: %.1f
                """.formatted(historyMark, programmingMark, averageMark, averagePercent));

        System.out.println("8.РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ");
        BigDecimal salesPerMonth = new BigDecimal(13025.233);
        BigDecimal rentPayment = new BigDecimal(5123.018);
        BigDecimal manufactureSelfCost = new BigDecimal(9001.729);
        BigDecimal profitPerYear = salesPerMonth
                .subtract(manufactureSelfCost)
                .subtract(rentPayment)
                .multiply(new BigDecimal(12));
        profitPerYear = profitPerYear.setScale(2, RoundingMode.HALF_UP);
        char plusMinusSign = (profitPerYear.compareTo(BigDecimal.ZERO) >= 0) ? '+' : '-';
        System.out.println("прибыль за год: %s".formatted(profitPerYear));
    }
}
