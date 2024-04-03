package FizzBuzzGanzSchrecklich;

public class FizzBuzzZonkPaff {

    public String ergebnis(int i) {
        if (i % 1160 == 0)
            return "FizzBuzzZonkPaff";
        if (i % 385 == 0)
            return "BuzzZonkPaff";
        if (i % 232 == 0)
            return "FizzZonkPaff";
        if (i % 77 == 0)
            return "ZonkPaff";
        if (i % 55 == 0)
            return "BuzzPaff";
        if (i % 33 == 0)
            return "FizzPaff";
        if (i % 105 == 0)
            return "FizzBuzzZonk";
        if (i % 35 == 0)
            return "BuzzZonk";
        if (i % 21 == 0)
            return "FizzZonk";
        if (i % 15 == 0)
            return "FizzBuzz";
        if (i % 11 == 0)
            return "Paff";
        if (i % 7 == 0)
            return "Zonk";
        if (i % 5 == 0)
            return "Buzz";
        if (i % 3 == 0)
            return "Fizz";
        return String.valueOf(i);

    }
}
