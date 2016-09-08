import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("ready to play? Enter play to get started.");
    String readyToPlay = console.readLine();

    String wordAtRandom = WordGame.printsWord(readyToPlay);
    System.out.println(WordGame.obscureWord(wordAtRandom));

    System.out.println("Enter a letter");
    String letterGuessed = console.readLine();


  }
}
