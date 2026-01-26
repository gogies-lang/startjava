import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println(" 1 ВЫВОД ASCII-ГРАФИКИ");

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
        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА ");

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

        System.out.println(" ВАРИАНТ РЕШЕНИЯ ДВА №2");

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


        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        int num1 = 2;
        int num2 = 5;
        System.out.println(" 1 СПОСОБ ТРЕТЬЯ ПЕРЕМЕННАЯ:");
        int swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2);
        System.out.println(" 2. СПОСОБ ЧЕРЕЗ АРИФМЕТИКУ (СУММА И ВЫЧИТАНИЕ):");
        num1 += num2;
        num2 = num1 - num2; 
        num1 -= num2;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2);
        System.out.println(" 3. СПОСОБ ПОБИТОВАЯ ОПЕРАЦИЯ");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения: num1 = " + num1 + ", num2 = " + num2);

        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");

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

        System.out.println("5. АНАЛИЗ КОДА ТОВАРА");

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

        System.out.println("6. ДАТЧИКИ РАКЕТЫ ");

        int traveledDistance = Integer.MAX_VALUE;
        String traveledDistanceOutput = """
        пройденный путь: %d Км
        +1: %d Км
        -1: %d Км
                """.formatted(traveledDistance, (int) (traveledDistance + 1),
                    (int) (traveledDistance + 1 - 1)); // check code
        System.out.println(traveledDistanceOutput);

        byte temperature = Byte.MAX_VALUE;
        String temperatureOutput = """
        температура: %d °C
        +1: %d °C
        -1: %d °C
                """.formatted(temperature, (byte) (temperature + 1), (byte) (temperature + 1 - 1));
        System.out.println(temperatureOutput);

        short pressure = Short.MAX_VALUE;
        String pressureOutput = """
                        давление: %d b
                        +1: %d b
                        -1: %d b
                        """.formatted(pressure, (short) (pressure + 1), (short) (pressure + 1 - 1));
        System.out.println(pressureOutput);

        long timeFromStart = Long.MAX_VALUE;
        String timeFromStartOutput = """
                        Время с отправления: %d мс
                        +1: %d мс
                        -1: %d мс
                        """.formatted(timeFromStart, (long) (timeFromStart + 1), (long) (timeFromStart + 1 - 1));
        System.out.println(timeFromStartOutput);

        char modeCode = Character.MAX_VALUE;
        String modeCodeOutput = """
                        Код состояния: %d 
                        +1: %d 
                        -1: %d 
                        """.formatted((int) modeCode, (int) (char) (modeCode + 1),
                        (int) (char) (modeCode + 1 - 1)); // check
        System.out.println(modeCodeOutput);

        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС ");

        Runtime runtime = Runtime.getRuntime();
        double allocatedMemory = runtime.totalMemory() / (1024.0 * 1024.0);
        double freeMemory = runtime.freeMemory() / (1024.0 * 1024.0);
        double usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / (1024.0 * 1024.0);
        double maxAllocatedMemory = runtime.maxMemory() / (1024.0 * 1024.0);
        int cores = runtime.availableProcessors();

        System.out.println("""

                        выделенная память - %.1f (МБ)
                        свободная память - %.1f (МБ)
                        используемая память - %.1f  (Мб)
                        максимально доступная для выделения память - %.1f  (Мб) 
                        доступное число ядер - %d 
                        """.formatted(allocatedMemory, freeMemory, usedMemory, maxAllocatedMemory, cores));

        String drive = System.getProperty("user.dir").substring(0, 2);
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

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");

        long startNano = System.nanoTime();
        LocalTime startTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        long finishNano = System.nanoTime();
        LocalTime finishTime = LocalTime.now();
        double timeElapsed = (finishNano - startNano) / 1_000_000_000.0;
        String table = """
                        | Старт проверки | %s |         |
                        +----------------+--------------+
                        | Финиш проверки | %s |         |
                        +----------------+--------------+
                        | Время работы | %.3f сек |     |
                        """.formatted(dtf.format(startTime), dtf.format(finishTime), timeElapsed);
        System.out.println(table);
    }
}