public class ScoreKeeper {
    private int playerScore;
    private int computerScore;

    public ScoreKeeper() {
        playerScore = 0;
        computerScore = 0;
    }

    // Метод для добавления очков игроку
    public void addPlayerScore(int score) {
        playerScore += score;
    }

    // Метод для добавления очков компьютеру
    public void addComputerScore(int score) {
        computerScore += score;
    }

    // Проверка победителя
    public String checkWinner() {
        if (playerScore >= 20) {
            return "Player wins!";
        } else if (computerScore >= 20) {
            return "Computer wins!";
        }
        return null;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }
}
