import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
@Test
    void checkFizzBuzzTest0() {
    int number = 221;
    String expected = "two hundred and twenty one";
    String result = FizzBuzz.displayFizzBuzz(number);
    assertEquals(result, expected);
}
@Test
    void checkFizzBuzzTest3() {
    int number = 3;
    String expected = "Fizz";
    String result = FizzBuzz.displayFizzBuzz(number);
    assertEquals(result, expected);
}
@Test
    void checkFizzBuzzTest5() {
    int number = 5;
    String expected = "Buzz";
    String result = FizzBuzz.displayFizzBuzz(number);
    assertEquals(result, expected);
}
@Test
    void checkFizzBuzzTest15() {
    int number = 15;
    String expected = "FizzBuzz";
    String result = FizzBuzz.displayFizzBuzz(number);
    assertEquals(result, expected);
}


}