package FizzBuzzKISS;

public class Zonk implements FizzBuzzFunction {
    private final FizzBuzzFunction fizzBuzzFunction;

    public Zonk(FizzBuzzFunction fizzBuzzFunction) {
        this.fizzBuzzFunction = fizzBuzzFunction;
    }

    @Override
    public String ergebniss(int i) {
        String ergebniss = fizzBuzzFunction.ergebniss(i);
        if (i % 7 == 0)
            return ergebniss + "Zonk";
        return ergebniss;
    }
}
