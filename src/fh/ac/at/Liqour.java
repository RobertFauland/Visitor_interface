package fh.ac.at;

public class Liqour implements Visitable{

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    private double price;

    Liqour(double item) {
        price = item;
    }

    public double getPrice() {

        return price;
    }
}
