import org.junit.*;
import static org.junit.Assert.*;

public class WordGameTest {

  @Test
  public void printsWord_printsWord_String(){
    WordGame testWordGame = new WordGame();
    assertEquals(true, testWordGame.printsWord(""));
  }


}
