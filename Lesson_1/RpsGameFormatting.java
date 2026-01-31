import java.util.Random;

public class RpsGameFormatting {
    public static void main(String[] args) throws InterruptedException {
        String rock = "r";
        String scissors = "s";
        String paper = "p";
        String firstName = "HEL";
        Random rnd = new Random();

        int firstPosition = rnd.nextInt(1, 101);
        String firstSign = rock;
        if (firstPosition > 66) {
            firstSign = paper;
        } else if (firstPosition > 33) {
            firstSign = scissors;
            }

        System.out.println("Ход "+ firstName + ": ");
        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r" );
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }

        System.out.println(firstSign);

        String secondName = "WALLE";
        int secondPosidion = rnd.nextInt (1, 101);
        String secondSign = rock;

        if (secondPosidion > 66) {
            secondSign = paper;
        } else if (secondPosidion > 33) {
            secondSign = scissors;
        }
        System.out.println("Ход " + secondName +": ");
        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }

        System.out.println (secondSign);


        if (firstSign.equals(secondSign)) {
            System.out.println("Победила дружба!");
            return;
        }

        boolean isEqualfirstName = firstSign.equals(rock) && secondSign.equals(scissors) ||
                    firstSign.equals(scissors) && secondSign.equals(paper) ||
                    firstSign.equals(paper) && secondSign.equals(rock);

        if (isEqualfirstName) {
            System.out.println("\nПобедил - " + firstName);
        } else {
            System.out.println("\nПобедил - " + secondName);
        }
    }
}