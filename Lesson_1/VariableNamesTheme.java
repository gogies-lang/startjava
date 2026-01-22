public class VariableNamesTheme {
    public static void main(String[] args) {
        // Блок 1. Разные переменные
        System.out.println();
        String codeBlock1 = "Разные переменные";
        System.out.println(codeBlock1);
        System.out.println();
        // Сумма чисел
        int digitSum = 5 + 5;
        System.out.println("Сумма чисел = " + digitSum);

        // Цифра
        int num = 1;
        System.out.println("Цифра = " + num);

        // Произведение цифр
        int multNum = 4;
        System.out.println("Произведение цифр 2 * 2 = " + multNum);

        // Максимальное число
        int maxNum = 2147483647;
        System.out.println("Максимальное число = " + maxNum);

        // Количество десятков
        int tenAmount = 100;
        System.out.println("Количество десятков в 1000 = " + tenAmount);

        // Вес собаки
        int dogWeight = 14;
        System.out.println("Вес собаки = " + dogWeight);

        // Исходное число
        int initNum = 999;
        System.out.println("Исходное число = " + initNum);

        // Процент по вкладу
        int interestOnDeposit = 16;
        System.out.println("Процент по вкладу = " + interestOnDeposit);

        // Символ &
        char newChar = '&';
        System.out.println("Символ = " + newChar);

        // Код ошибки
        int errCode = 404;
        System.out.println("Код ошибки " + errCode);

        // Тип сообщения
        String msgType = "Новое сообщение";
        System.out.println(msgType);

        // Число нулей
        int zeroAmount = 0;
        System.out.println("В числе 18 количество нулей = " + zeroAmount);

        // Уникальное число
        int uniqueNumber = -17091999;
        System.out.println("Уникальное число = " + uniqueNumber);

        // Случайное число
        int randomNum = 4545101;
        System.out.println("Случайное число = " + randomNum);

        // Математическое выражение
        int mathExpression = 1 + 5;
        System.out.println("математическое выражение 1 + 5 = " + mathExpression);

        // Счет в игре
        int gameScore = 3423461;
        System.out.println("Ваш итоговый счет = " + gameScore);

        // Максимальная длина
        int maxLen = 1493;
        System.out.println("Максимально доступная длина = " + maxLen);

        // Пункт меню
        String menuOption = "настройки";
        System.out.println("Пункт меню " + menuOption);

        // Стоимость кофе
        int coffeePrice = 3;
        System.out.println("Цена кофе = " + coffeePrice + "$");

        // Начальная дата
        int initDateYear = 2000;
        int initDateMonth = 12;
        int initDateDay = 4;
        System.out.println("начальная дата = " + initDateYear + "." + initDateMonth + "." + initDateDay);
        
        // Окончание диапазона
        int endRange = 4456721;
        System.out.println("Окончание диапазона = " + endRange);

        // Имя работника месяца
        String monthEmployeeName = "Иван";
        System.out.println("Имя работника месяца: " + monthEmployeeName);

        // Название электронной книги
        String ebookTitle = "Властелин колец";
        System.out.println("Название электронной книги: " + ebookTitle);

        // Размер
        int size = 15;
        System.out.println("Размер: " + size + " мм");

        // Вместимость
        int capasity = 1000;
        System.out.println("Вместимость: " + capasity + " ТБ");

        // Счетчик
        int counter = 25;
        System.out.println("Счетчик: " + counter);

        // Путь до файла
        String filePath = "C:\\Program Files\\Common Files";
        System.out.println("Путь до папки Oracle: " + filePath);

        // Количество чисел в строке
        int numAmountLine = 0;
        System.out.println("Количество чисел в этой строке = " + numAmountLine);

        // Блок 2. BOOLEAN-переменные
        String codeBlock2 = "BOOLEAN-переменные";
        System.out.println();
        System.out.println(codeBlock2);
        System.out.println();

        // сотни равны?
        boolean equalHundreds;
        equalHundreds = true;
        if (equalHundreds) {
            System.out.println("да, сотни равны");
        }

        // компьютер включен?
        boolean isPcActive = true;
        if (isPcActive) {
            System.out.println("да, компьютер включен.");
        }

        // есть равные цифры?
        boolean numbersEqual = false;
        if (numbersEqual == false) {
            System.out.println("нет, цифры не равны.");
        }

        // служба создана?
        boolean serviceCreated = true;
        if (serviceCreated) {
            System.out.println("служба создана.");
        }

        // файл пустой?
        boolean isFileEmpty = false;
        if (isFileEmpty == false) {
            System.out.println("Файл не пустой.");
        }

        // соединение активное?
        boolean isConnectActive = false;
        if (isConnectActive == false) {
            System.out.println("Соединение прервано");
        }

        // новый?
        boolean isNew = true;
        if (isNew) {
            System.out.println("Да, Новый");
        }

        // электронная почта действительная?
        boolean isMailAvailable = true;
        if (isMailAvailable) {
            System.out.println("Добро пожаловать на почту!");
        }

        // имеются уникальные строки?
        boolean hasUniqueStr = true;
        if (hasUniqueStr) {
            System.out.println("уникальные строки имеются");
        }

        // Блок 3. Аббревиатуры
        String codeBlock3 = "Аббревиатуры";
        System.out.println();
        System.out.println(codeBlock3);
        System.out.println();

        // старый universally unique identifier
        String uuid = ("0001-0002-0003-0004-000000000005");
        System.out.println(uuid + " = your UUID");

        // производитель оперативной памяти
        String ramManufacturer = ("Samsung");
        System.out.println("Производитель оперативной памяти: " + ramManufacturer);

        // емкость жесткого диска
        int hddCapasity = 512;
        System.out.println("Обьем жесткого диска:" + hddCapasity);

        // определение термина протокола передачи гипертекста
        String httpDefinition = ("HTTP");
        System.out.println(httpDefinition + "расшифровывается как HyperText Transfer Protocol");

        // сокращенный uniform resource locator
        String urlDefinition = ("url");
        System.out.println(urlDefinition + " is unique web address for a specific resource");

        // новый идентификатор клиента
        String newId = ("didudado");
        System.out.println("новый никнейм: " + newId);

        // количество символов в american standard code for information interchange
        int asciiNumAmount = 128;
        System.out.println("в ASCII " + 128 + " символов");
    }
}