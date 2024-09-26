import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Game! First to reach 20 points wins.");

        while (true) {
            System.out.println("Press Enter to roll the dice...");
            scanner.nextLine();

            // Бросок игрока
            int playerRoll = dice.roll();
            scoreKeeper.addPlayerScore(playerRoll);
            System.out.println("Player rolled: " + playerRoll + ". Total score: " + scoreKeeper.getPlayerScore());

            // Проверка победы игрока
            String result = scoreKeeper.checkWinner();
            if (result != null) {
                System.out.println(result);
                break;
            }

            // Бросок компьютера
            int computerRoll = dice.roll();
            scoreKeeper.addComputerScore(computerRoll);
            System.out.println("Computer rolled: " + computerRoll + ". Total score: " + scoreKeeper.getComputerScore());

            // Проверка победы компьютера
            result = scoreKeeper.checkWinner();
            if (result != null) {
                System.out.println(result);
                break;
            }
        }

        scanner.close();
    }
}
