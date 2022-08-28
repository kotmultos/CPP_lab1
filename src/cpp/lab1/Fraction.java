package cpp.lab1;

public class Fraction{
    private double nominator;
    private double denominator;

    public Fraction(double nominator, double denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public void multiply(Fraction other) {
        this.nominator *= other.nominator;
        this.denominator *= other.denominator;
    }

    public Fraction add(Fraction other){
        double newDenominator = this.denominator * other.denominator;
        double newNominator = this.nominator * (newDenominator / this.denominator) +
                             other.nominator * (newDenominator / other.denominator);
        return new Fraction(newNominator, newDenominator);
    }

    public String toString() {
        return nominator + " / " + denominator + " = " + nominator/denominator;
    }
}
