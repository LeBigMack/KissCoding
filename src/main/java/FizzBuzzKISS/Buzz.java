package FizzBuzzKISS;

public class Buzz implements FizzBuzzFunction {
    private final FizzBuzzFunction fizzBuzzFunction;

    public Buzz(Fizz fizzBuzzFunction) {
        this.fizzBuzzFunction = fizzBuzzFunction;
    }

    @Override
    public String ergebniss(int i) {
        String ergebniss = fizzBuzzFunction.ergebniss(i);
        if (i % 5 == 0)
            return ergebniss + "Buzz";
        return ergebniss;
    }
}
