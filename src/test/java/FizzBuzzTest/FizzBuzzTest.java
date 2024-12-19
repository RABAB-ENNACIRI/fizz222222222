package FizzBuzzTest;
import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzTest() {
        FizzBuzz fb = new FizzBuzz();
        int result = fb.add(2,3);
        assertEquals(5, result, "2 + 3 doit être égal à 5");
    }
}
