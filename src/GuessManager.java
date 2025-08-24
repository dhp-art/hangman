import java.util.ArrayList;

public class GuessManager {

    private ArrayList<Character> correctGuesses;
    private ArrayList<Character> incorrectGuesses;


    public GuessManager() {
        correctGuesses = new ArrayList<>();
        incorrectGuesses = new ArrayList<>();
    }

    public boolean hasBeenGuessed(char letter) {
        return (correctGuesses.contains(letter) || incorrectGuesses.contains(letter));
    }

    public void addCorrectGuess (char letter) {
        correctGuesses.add(letter);
    }

    public void addIncorrectGuess (char letter) {
        incorrectGuesses.add(letter);
    }

    public int getWrongGuessCount() {
        return incorrectGuesses.size();
    }

    public boolean isGameOver() {
        return getWrongGuessCount() == incorrectGuesses.size();
    }

    public int getCorrectGuess() {
        return correctGuesses.size();
    }


}
