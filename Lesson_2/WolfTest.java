public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        System.out.println("""
                Характеристики волка:
                Пол: %s
                Кличка: %s
                Возраст: %d лет
                Вес: %.1f кг
                Окрас: %s
                """.formatted(wolf.gender, wolf.name, wolf.age, wolf.weight, wolf.color));

        System.out.println("Действия волка:");
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}