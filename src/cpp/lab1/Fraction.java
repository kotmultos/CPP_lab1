package cpp.lab1;

public class Fraction implements IFraction{
    private double nominator;
    private double denominator;

    public Fraction(double nominator, double denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }
    @Override
    public void multiply(double a){
        nominator += a;
    }
    @Override
    public void divide(double a) {
        if(a == 0) System.out.println("Operation of division vy 0 is not allowed");
        else denominator += a;
    }

    @Override
    public String toString() {
        return nominator + " / " + denominator + " = " + nominator/denominator;
    }
}
