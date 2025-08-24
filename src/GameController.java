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

        //2. while loop

        //3. win/lose final result
    }





}
