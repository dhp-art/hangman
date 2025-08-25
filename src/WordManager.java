import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class WordManager {

    private ArrayList<String> words;
    private String currentWord;

    public WordManager() {

        words = new ArrayList<>();

        try {
            File file = new File("src/words_list.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    words.add(line);
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public String getRandomWord() {

        String randomWord = words.get((int)(Math.random() * words.size()));
        this.currentWord = randomWord;
        return randomWord;
    }

    public boolean isWordComplete(ArrayList<Character> guessedLetters) {

        int foundLetter = 0;

        for (char letter : this.currentWord.toCharArray()) {
            if (guessedLetters.contains(letter)){
                foundLetter++;
            }
        }
        return foundLetter == this.currentWord.length();
    }

    public boolean isLetterInWord(char letter) {
        return this.currentWord.contains(Character.toString(letter));
    }

    public void displayWordState(ArrayList<Character> revealedLetters) {

        String result = "";

        for (char letter : this.currentWord.toCharArray()) {
            if (revealedLetters.contains(letter)) {
                result = result + letter;
            } else {
                result = result + "_";
            }
            
        }
        System.out.println(result);
    }



}
