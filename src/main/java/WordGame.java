import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class WordGame {

  public static String printsWord(String play) {
    List<String> myWordList = new ArrayList<String>();
      myWordList.add("binary");
      myWordList.add("habit");
      myWordList.add("bain");
      myWordList.add("braid");

    Random myRandomGenerator = new Random();
    int index = myRandomGenerator.nextInt(3);
    String printWord = myWordList.get(index);
    return printWord;
  }
  public static String obscureWord(String wordToObscure) {
    String obscuredWord = wordToObscure.replace('a', '_');
    // obscuredWord = wordToObscure.replace('b', '_');
    // obscuredWord = wordToObscure.replace('i', '_');
    return obscuredWord;
  }

}
