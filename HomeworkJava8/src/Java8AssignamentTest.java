import static org.junit.jupiter.api.Assertions.*;

class Java8AssignamentTest {

    @org.junit.jupiter.api.Test
    void checkMonth() {
        assertTrue(Java8Assignament.checkMonth(1));
        assertTrue(Java8Assignament.checkMonth(12));
    }

    @org.junit.jupiter.api.Test
    void checkMonth2() {
        assertFalse(Java8Assignament.checkMonth(0));
        assertFalse(Java8Assignament.checkMonth(13));
    }
}