import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final long startNano = System.nanoTime();
        final LocalTime startTime = LocalTime.now(); // 8 задание. старт замера работы кода.
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

        System.out.println("\n1 ВЫВОД ASCII-ГРАФИКИ\n");

        System.out.println(String.join("\n",
                        "                      /\\",
                        "    J    a  v     v  /  \\",
                        "    J   a a  v   v  /_( )\\",
                        " J  J  aaaaa  V V  /      \\",
                        "  JJ  a     a  V  /___/\\___\\"
                ));

        System.out.println("""
                         /\\             
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a 
                """);
        System.out.println("\n2. РАСЧЕТ СТОИМОСТИ ТОВАРА\n");

        float penPrice = 105.50f;
        float bookPrice = 235.23f;
        float discountPercent = 0.11f;
        float dicountRemainder = 0.89f;
        float basePrice = penPrice + bookPrice;
        float discountSum = basePrice * discountPercent;
        float discountPrice = basePrice * dicountRemainder;

        System.out.println("стоимость товаров без скидки: " + basePrice + 
                "\nсумма скидки: " + discountSum + 
                "\nстоимость товаров со скидкой: " + discountPrice);

        System.out.println("\nВАРИАНТ РЕШЕНИЯ ДВА №2\n");

        BigDecimal penPriceBd = new BigDecimal("105.50");
        BigDecimal bookPriceBd = new BigDecimal("235.23");
        BigDecimal discountPercentBd = BigDecimal.valueOf(0.11);
        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd)
                        .setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountSumBd = basePriceBd.multiply(discountPercentBd)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountPriceBd = basePriceBd.subtract(discountSumBd)
                        .setScale(2, RoundingMode.HALF_UP);
        System.out.println("стоимость товаров без скидки: " + basePriceBd + 
                "\nсумма скидки: " + discountSumBd + 
                "\nстоимость товаров со скидкой: " + discountPriceBd);

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("\nI СПОСОБ ТРЕТЬЯ ПЕРЕМЕННАЯ:");
        int swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("\nII СПОСОБ ЧЕРЕЗ АРИФМЕТИКУ (СУММА И ВЫЧИТАНИЕ):");
        num1 += num2;
        num2 = num1 - num2; 
        num1 -= num2;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("\nIII СПОСОБ ПОБИТОВАЯ ОПЕРАЦИЯ");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("\n4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ\n");

        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;
        System.out.printf("%-2d%-2d%-2d%-2d%-2d%-2d%n",
                code1, code2, code3, code4, code5, code6);
        System.out.printf("%-2C%-2c%-2c%-2c%-2c%-2c%n",
                code1, code2, code3, code4, code5, code6);

        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА\n");

        int uniqueThreeDigitCode = 123;
        int goodCategory = uniqueThreeDigitCode / 100;
        int subCategory = (uniqueThreeDigitCode / 10) % 10;
        int packType = uniqueThreeDigitCode % 10;
        int checkSum = goodCategory + subCategory + packType;
        int verificationCode = goodCategory * subCategory * packType;
        System.out.println("Исходный код: " + uniqueThreeDigitCode);
        System.out.println("Категория: " + goodCategory);
        System.out.println("Подкатегория: " + subCategory);
        System.out.println("Тип упаковки: " + packType);
        System.out.println("Контрольная сумма: " + checkSum);
        System.out.println("Проверочный код: " + verificationCode);

        System.out.println("\n6. ДАТЧИКИ РАКЕТЫ\n");

        int traveledDistance = Integer.MAX_VALUE;
        int tdStart = traveledDistance;
        int tdInc = ++traveledDistance;
        int tdDec = --traveledDistance;

        System.out.println("""
                пройденный путь: %d Км
                +1: %d Км
                -1: %d Км
                """.formatted(tdStart, tdInc, tdDec));

        byte temperature = Byte.MAX_VALUE;
        byte tempStart = temperature;
        byte tempInc = ++temperature;
        byte tempDec = --temperature;

        System.out.println("""
                температура: %d °C
                +1: %d °C
                -1: %d °C
                """.formatted(tempStart, tempInc, tempDec));

        short pressure = Short.MAX_VALUE;
        short prsStart = pressure;
        short prsInc = ++pressure; 
        short prsDec = --pressure; 

        System.out.println("""
                давление: %d b
                +1: %d b
                -1: %d b
                """.formatted(prsStart, prsInc, prsDec));

        long timeFromStart = Long.MAX_VALUE;
        long tfsStart = timeFromStart;
        long tfsInc = ++timeFromStart;
        long tfsDec = --timeFromStart;

        System.out.println("""
                Время с отправления: %d мс
                +1: %d мс
                -1 (декремент): %d мс
                """.formatted(tfsStart, tfsInc, tfsDec));

        char modeCode = Character.MAX_VALUE;
        int codeStart = (int) modeCode;
        int codeInc = (int) ++modeCode;
        int codeDec = (int) --modeCode;

        System.out.println("""
                Код состояния: %d 
                +1 (инкремент): %d 
                -1 (декремент): %d 
                """.formatted(codeStart, codeInc, codeDec));

        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");

        Runtime rt = Runtime.getRuntime();
        double mult = 1024.0 * 1024.0;
        double allocatedMemory = rt.totalMemory() / mult;
        double freeMemory = rt.freeMemory() / mult;
        double usedMemory = allocatedMemory - freeMemory;
        double maxAllocatedMemory = rt.maxMemory() / mult;
        int cores = rt.availableProcessors();

        System.out.println("""
                выделенная память - %.1f (МБ)
                свободная память - %.1f (МБ)
                используемая память - %.1f (Мб)
                максимально доступная для выделения память - %.1f (Мб)
                доступное число ядер - %d
                """.formatted(allocatedMemory, freeMemory, usedMemory, maxAllocatedMemory, cores));

        String drive = System.getProperty("user.dir").charAt(0) + "";;
        String osVer = System.getProperty("os.version");
        String javaVer = System.getProperty("java.version");
        String separator = System.getProperty("file.separator");

        System.out.println("""
                ПАРАМЕТРЫ ОС:
                Системный диск: %s
                Версия ОС: %s
                Версия Java: %s
                Разделитель пути: %s
                """.formatted(drive, osVer, javaVer, separator));

        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА\n");
        long finishNano = System.nanoTime();
        LocalTime finishTime = LocalTime.now();
        double timeElapsed = (finishNano - startNano) / 1e9;
        System.out.println("""
                +----------------+--------------+
                | Старт проверки | %s |         
                +----------------+--------------+
                | Финиш проверки | %s |         
                +----------------+--------------+
                | Время работы   | %.3f сек    |
                +----------------+--------------+
                """.formatted(
                dtf.format(startTime), 
                dtf.format(finishTime), 
                timeElapsed
        ));
    }
}