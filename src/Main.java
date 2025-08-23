

public class Main {
    public static void main(String[] args) {

        //WordManager wm = new WordManager("src/words_list.txt");

        //System.out.println(wm.getRandomWord());

        /*GuessManager gm = new GuessManager();

        System.out.println("Has A been guessed? " + gm.hasBeenGuessed('A'));
        gm.addIncorrectGuess('Z');
        gm.addCorrectGuess('A');

        System.out.println("Has A been guessed? " + gm.hasBeenGuessed('A'));
        System.out.println("Wrong guess count: " + gm.getWrongGuessCount());
        System.out.println("Game over? : " + gm.isGameOver());*/

        /*HangmanDraw dr = new HangmanDraw();

        dr.drawHangman(2);
        System.out.println(dr);
        */

        HangmanDraw hmd = new HangmanDraw();

        for (int i = 0; i <= 6; i++) {
            System.out.println("Stage " + i + ":");
            hmd.drawHangman(i);
            System.out.println();
        }


    }
}