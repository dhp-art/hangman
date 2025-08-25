import java.util.Scanner;

public class GameController {

    private WordManager wordManager;
    private GuessManager guessManager;
    private HangmanDraw hangmanDraw;
    private Scanner scanner;

    public GameController() {
        this.wordManager = new WordManager();
        this.guessManager = new GuessManager();
        this.hangmanDraw = new HangmanDraw();
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        //1. initialize the game
        String randomWord = this.wordManager.getRandomWord();
        System.out.println("\nLET'S START HANGMAN GAME!");

        //2. while loop
        while (!this.guessManager.isGameOver() &&
                !this.wordManager.isWordComplete(this.guessManager.getCorrectGuesses())) {

            this.hangmanDraw.drawHangman(this.guessManager.getWrongGuessCount());
            this.wordManager.displayWordState(this.guessManager.getCorrectGuesses());

            System.out.println("GUESS A LETTER IN LATIN: ");
            String input = this.scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("OOPS! GUESS A LETTER IN LATIN: ");
            }
            char playerGuess = input.toUpperCase().charAt(0);




        }

        //3. win/lose final result
    }





}
