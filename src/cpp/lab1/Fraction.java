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

    public void add(Fraction other){
        System.out.println("add");
    }

//    public void multiply(double a){
//        nominator += a;
//    }
//
//    public void divide(double a) {
//        if(a == 0) System.out.println("Operation of division vy 0 is not allowed");
//        else denominator += a;
//    }


    public String toString() {
        return nominator + " / " + denominator + " = " + nominator/denominator;
    }
}
