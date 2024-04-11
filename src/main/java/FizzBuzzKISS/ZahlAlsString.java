package FizzBuzzKISS;

public class ZahlAlsString implements FizzBuzzFunction {
    private final FizzBuzzFunction fizzBuzzFunction;

    public ZahlAlsString(FizzBuzzFunction fizzBuzzFunction) {
        this.fizzBuzzFunction = fizzBuzzFunction;
    }

    @Override
    public String ergebniss(int i) {
        String ergebniss = fizzBuzzFunction.ergebniss(i);
        if ("".equals(ergebniss))
            return String.valueOf(i);
        return ergebniss;
    }
}
