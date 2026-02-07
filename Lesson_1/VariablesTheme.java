import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        final long startNano = System.nanoTime();
        final LocalTime startTime = LocalTime.now(); // 8 задание. старт замера работы кода.

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
        System.out.println("\n2 РАСЧЕТ СТОИМОСТИ ТОВАРА\n");

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

        System.out.println("\nВАРИАНТ РЕШЕНИЯ №2\n");

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

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
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

        int letterP = 1055;
        int letterR = 1088;
        int letterI = 1080;
        int letterV = 1074;
        int letterE = 1077;
        int letterT = 1090;
        System.out.printf("%d — %c\n", letterP, (char) letterP);
        System.out.printf("%d — %c\n", letterR, (char) letterR);
        System.out.printf("%d — %c\n", letterI, (char) letterI);
        System.out.printf("%d — %c\n", letterV, (char) letterV);
        System.out.printf("%d — %c\n", letterE, (char) letterE);
        System.out.printf("%d — %c\n", letterT, (char) letterT);

        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА\n");

        int uniqueGoodId = 123;
        int goodCategory = uniqueGoodId / 100;
        int subCategory = (uniqueGoodId / 10) % 10;
        int packType = uniqueGoodId % 10;
        int checkSum = goodCategory + subCategory + packType;
        int verificationCode = goodCategory * subCategory * packType;

        System.out.println("""
                Исходный код: %d
                Категория: %s
                Подкатегория: %s
                Тип упаковки: %s
                Контрольная сумма: %d
                Проверочный код: %d
                """.formatted(uniqueGoodId, goodCategory, subCategory, 
                packType, checkSum, verificationCode));

        System.out.println("\n6. ДАТЧИКИ РАКЕТЫ\n");

        int traveledDistance = Integer.MAX_VALUE;

        System.out.println("""
                [Пройденный путь, км]: 
                Исходное:
                +1: %d Км
                -1: %d Км
                """.formatted(traveledDistance, ++traveledDistance, --traveledDistance));

        byte temperature = Byte.MAX_VALUE;
        System.out.println("""
                [Температура, °C]
                Исходное:
                +1: %d °C
                -1: %d °C
                """.formatted(temperature, ++temperature, --temperature));

        short pressure = Short.MAX_VALUE;
        System.out.println("""
                [Давление, b]:
                Исходное:
                +1: %d b
                -1: %d b
                """.formatted(pressure, ++pressure, --pressure));

        long timeFromStart = Long.MAX_VALUE;
        System.out.println("""
                [Время с отправления, мс]:
                Исходное:
                +1: %d мс
                -1: %d мс
                """.formatted(timeFromStart, ++timeFromStart, --timeFromStart));

        char statusCode = Character.MAX_VALUE;
        System.out.println("""
                Код состояния: %d 
                +1: %d 
                -1: %d 
                """.formatted((int) statusCode, (int) ++statusCode, (int) --statusCode));

        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");

        Runtime rt = Runtime.getRuntime();
        double multResult = 1024.0 * 1024.0;
        double allocatedMemory = rt.totalMemory() / multResult;
        double freeMemory = rt.freeMemory() / multResult;
        double usedMemory = allocatedMemory - freeMemory;
        double maxAllocatedMemory = rt.maxMemory() / multResult;
        int cores = rt.availableProcessors();

        System.out.println("""
                Характеристики JVM:
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

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА\n");
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
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