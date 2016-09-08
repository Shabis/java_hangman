import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("ready to play? Enter play to get started.");
    String readyToPlay = console.readLine();
    System.out.println(WordGame.printsWord(readyToPlay));

    System.out.println("Enter a letter");
    String letterGuessed = console.readLine();


  }
}
