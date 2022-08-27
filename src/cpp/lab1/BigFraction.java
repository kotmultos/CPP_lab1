package cpp.lab1;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigFraction implements  IFraction{

    BigDecimal nominator;
    BigDecimal denominator;

    public BigFraction(String nominator, String denominator) {
        this.nominator = new BigDecimal(nominator);
        this.denominator = new BigDecimal(denominator);
    }

    @Override
    public void multiply(double a) {
        nominator = nominator.multiply(new BigDecimal(a));
    }

    @Override
    public void divide(double a) {
        denominator = denominator.multiply(new BigDecimal(a), new MathContext(3));
    }

    @Override
    public String toString() {
        return nominator + " / " + denominator + " = " + nominator.divide(denominator, new MathContext(3));
    }
}
