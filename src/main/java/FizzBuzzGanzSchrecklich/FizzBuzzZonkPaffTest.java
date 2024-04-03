package FizzBuzzGanzSchrecklich;

import FizzBuzz.FizzBuzz;
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

    @Test
    public void bei_7_wert_Zonk() {
        Assertions.assertEquals("Zonk", sut.ergebnis(7));
    }

    @Test
    public void bei_21_wert_FizzBuzz() {
        Assertions.assertEquals("FizzZonk", sut.ergebnis(21));
    }

    @Test
    public void bei_35_wert_FizzBuzz() {
        Assertions.assertEquals("BuzzZonk", sut.ergebnis(35));
    }

    @Test
    public void bei_105_wert_FizzBuzz() {
        Assertions.assertEquals("FizzBuzzZonk", sut.ergebnis(105));
    }

    @Test
    public void bei_11_wert_Paff() {
        Assertions.assertEquals("Paff", sut.ergebnis(11));
    }

    @Test
    public void bei_77_wert_ZonkPaff() {
        Assertions.assertEquals("ZonkPaff", sut.ergebnis(77));
    }

    @Test
    public void bei_55_wert_BuzzPaff() {
        Assertions.assertEquals("BuzzPaff", sut.ergebnis(55));
    }

    @Test
    public void bei_33_wert_FizzPaff() {
        Assertions.assertEquals("FizzPaff", sut.ergebnis(33));
    }
}
