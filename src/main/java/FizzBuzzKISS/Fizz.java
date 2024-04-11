package FizzBuzzKISS;

public class Fizz implements FizzBuzzFunction {
    @Override
    public String ergebniss(int i) {
        if (i % 3 == 0)
            return "Fizz";
        return "";
    }
}
