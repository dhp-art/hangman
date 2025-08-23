import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class WordManager {

    private ArrayList<String> words;

    public WordManager(String filePath) {

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
        return words.get((int)(Math.random() * words.size()));
    }


}
