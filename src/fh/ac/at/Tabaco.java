package fh.ac.at;

public class Tabaco implements Visitable {

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    private double price;

    Tabaco(double item) {
        price = item;
    }

    public double getPrice() {

        return price;
    }
}