package FizzBuzzGanzSchrecklich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzZonkPaffTest {

    private FizzBuzzZonkPaff sut = new FizzBuzzZonkPaff();

    @Test
    public void bei_1_wert_1AlsString() {
        Assertions.assertEquals("1", sut.ergebnis(1));
    }

    @Test
    public void bei_2_wert_2AlsString() {
        Assertions.assertEquals("2", sut.ergebnis(2));
    }

    @Test
    public void bei_3_wert_Fizz() {
        Assertions.assertEquals("Fizz", sut.ergebnis(3));
    }

    @Test
    public void bei_6_wert_Fizz() {
        Assertions.assertEquals("Fizz", sut.ergebnis(6));
    }

    @Test
    public void bei_5_wert_Buzz() {
        Assertions.assertEquals("Buzz", sut.ergebnis(5));
    }

    @Test
    public void bei_10_wert_Buzz() {
        Assertions.assertEquals("Buzz", sut.ergebnis(10));
    }

    @Test
    public void bei_15_wert_FizzBuzz() {
        Assertions.assertEquals("FizzBuzz", sut.ergebnis(15));
    }
}
