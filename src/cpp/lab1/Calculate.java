package cpp.lab1;

public class Calculate {
    public static IFraction series(int n) {
        IFraction fraction;
        if(n >= 15)
            fraction = new BigFraction("1.0","1.0");
        else
            fraction = new Fraction(1,1);

        for (int i = 2; i <= n; i++) {
            fraction.divide(i);
        }

        return fraction;
    }
}
