import org.junit.*;
import static org.junit.Assert.*;

public class WordGameTest {

  @Test
  public void printsWord_printsWord_String(){
    WordGame testWordGame = new WordGame();
    String printWord = testWordGame.printsWord("play");
    assertEquals(true, printWord instanceof String);
  }
}
