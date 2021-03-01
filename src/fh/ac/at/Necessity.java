package fh.ac.at;

public class Necessity implements Visitable {

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    private double price;

    Necessity(double item) {
        price = item;
    }

    public double getPrice() {

        return price;
    }
}