package FizzBuzzKISS;

import FizzBuzzKISS.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private FizzBuzz sut = new FizzBuzz();

    @Test
    public void bei_1_ergebnis_1AlsString() {
        Assertions.assertEquals("1", sut.ergebnis(1));
    }

    @Test
    public void bei_2_ergebnis_2AlsString() {
        Assertions.assertEquals("2", sut.ergebnis(2));
    }

    @Test
    public void bei_3_ergebnis_Fizz() {
        Assertions.assertEquals("Fizz", sut.ergebnis(3));
    }

    @Test
    public void bei_6_ergebnis_Fizz() {
        Assertions.assertEquals("Fizz", sut.ergebnis(6));
    }

    @Test
    public void bei_5_ergebnis_Buzz() {
        Assertions.assertEquals("Buzz", sut.ergebnis(5));
    }

    @Test
    public void bei_10_ergebnis_Buzz() {
        Assertions.assertEquals("Buzz", sut.ergebnis(10));
    }

    @Test
    public void bei_15_ergebnis_FizzBuzz() {
        Assertions.assertEquals(
                "FizzBuzz", sut.ergebnis(15));
    }

    @Test
    public void bei_7_ergebnis_Zonk() {
        Assertions.assertEquals(
                "Zonk", sut.ergebnis(7));
    }
    @Test
    public void bei_21_ergebnis_FizzZonk() {
        Assertions.assertEquals(
                "FizzZonk", sut.ergebnis(21));
    }
    @Test
    public void bei_35_ergebnis_BuzzZonk() {
        Assertions.assertEquals(
                "BuzzZonk", sut.ergebnis(35));
    }    @Test
    public void bei_105_ergebnis_FizzBuzzZonk() {
        Assertions.assertEquals(
                "FizzBuzzZonk", sut.ergebnis(105));
    }
}
