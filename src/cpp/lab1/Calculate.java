package cpp.lab1;

public class Calculate {
    public static String series(int n) {
        String res;
        if(n >= 15) {
            var fraction = new BigFraction("1.0", "1.0");
            BigFraction tmp;

            for (int i = 2; i <= n; i++) {
                tmp = new BigFraction("1.0", String.valueOf(i));
                System.out.println(tmp);
                fraction.add(tmp);
            }
            res = fraction.toString();
        }
        else{
            var fraction = new Fraction(1,1);
            Fraction tmp;
            for (int i = 2; i <= n; i++) {
                tmp = new Fraction(1, i);
                System.out.println(tmp);
                fraction.add(tmp);
            }
            res = fraction.toString();
        }

        return res;
    }
}
