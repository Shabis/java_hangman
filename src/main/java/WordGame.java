import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class WordGame {

  public static String printsWord(String play) {
    List<String> myWordList = new ArrayList<String>();
      myWordList.add("blah");
      myWordList.add("ugh");
      myWordList.add("programming");
      myWordList.add("@#$@!");

    Random myRandomGenerator = new Random();
    int index = myRandomGenerator.nextInt(3);
    String printWord = myWordList.get(index);
    return printWord;
  }


}
