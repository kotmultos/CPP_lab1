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

    public void multiply(BigFraction other) {
        this.nominator = this.nominator.multiply(other.nominator);
        this.denominator = this.denominator.multiply(other.denominator);
    }

    public void add(BigFraction other){
        System.out.println("add");
    }

//    public void multiply(double a) {
//        nominator = nominator.multiply(new BigDecimal(a));
//    }
//
//
//    public void divide(double a) {
//        denominator = denominator.multiply(new BigDecimal(a), new MathContext(3));
//    }


    public String toString() {
        return nominator + " / " + denominator + " = " + nominator.divide(denominator, new MathContext(3));
    }
}
