import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TicTacToeBoardGameTest {

    @Test
    void gameActive() {
        Assertions.assertTrue(true);
        Assertions.assertFalse(true);
    }

    @Test
    void checkForWinner() {
        Assertions.assertTrue(false);
    }

    @Test
    void notValid() {
        Assertions.assertEquals(3, 6);
    }

    @Test
    void isEmpty() {
        Assertions.assertEquals(2, 0);

    }

    @Test
    void makeMove() {
        Assertions.assertEquals(2, 1   );
        Assertions.assertNull(null);
    }
}