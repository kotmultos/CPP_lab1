package cpp.lab1;

import java.math.BigDecimal;

public class Calculate {
    public static String series(int n) {
        String res;
        if(n >= 15) {
            var fraction = new BigFraction("1.0", "1.0");
            BigFraction tmp;

            for (int i = 2; i <= n; i++) {
                tmp = new BigFraction("1.0", String.valueOf(Double.valueOf(i)));
                fraction = fraction.add(tmp);
            }
            res = fraction.toString();
        }
        else{
            var fraction = new Fraction(1,1);
            Fraction tmp;
            for (int i = 2; i <= n; i++) {
                tmp = new Fraction(1, i);
                fraction = fraction.add(tmp);
            }
            res = fraction.toString();
        }

        return res;
    }
}
