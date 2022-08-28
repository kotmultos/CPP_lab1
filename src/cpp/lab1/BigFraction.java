package cpp.lab1;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigFraction{

    BigDecimal nominator;
    BigDecimal denominator;

    public BigFraction(String nominator, String denominator) {
        this.nominator = new BigDecimal(nominator);
        this.denominator = new BigDecimal(denominator);
    }
    private BigFraction(BigDecimal nominator, BigDecimal denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public void multiply(BigFraction other) {
        this.nominator = this.nominator.multiply(other.nominator);
        this.denominator = this.denominator.multiply(other.denominator);
    }

    public BigFraction add(BigFraction other){
        BigDecimal newDenominator = this.denominator.multiply(other.denominator);
        BigDecimal newNominator =
                this.nominator.multiply (newDenominator.divide(this.denominator, new MathContext(10))).add
                (
                    other.nominator.multiply (newDenominator.divide(other.denominator, new MathContext(10)))
                );
        return new BigFraction(newNominator, newDenominator);
    }

    public String toString() {
        return nominator + " / " + denominator + " = " + nominator.divide(denominator, new MathContext(10));
    }
}
