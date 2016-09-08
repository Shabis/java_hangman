import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WordGame {

  public static boolean printsWord(String userInput) {
    String[] lettersToReplace = {"a", "i", "t", "b", "r"};
    String[] replacingLetters = {"_", "_", "_", "_", "_"};

  for ( i = 0 ; i < userInput.length ; i++ ) {
      if (char currentLetter : userInput.charAt(i)) {
        String convertedUserInput = replacingLetters[lettersToReplace.indexOf(currentLetter)];
      }

    return true;
  }

}
