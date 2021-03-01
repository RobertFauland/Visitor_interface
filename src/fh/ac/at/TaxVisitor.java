package fh.ac.at;

public class TaxVisitor implements Visitor{

    public TaxVisitor () {}  //Konstruktor


    public double visit(Liqour liqourItem) {
        System.out.println("Liqour");
        return liqourItem.getPrice()+1.20;
    }

    public double visit(Tabaco tabacoItem) {
        System.out.println("Tabaco");
        return tabacoItem.getPrice()+2.50;
    }

    public double visit(Necessity necessityItem) {
        System.out.println("Necessity");
        return necessityItem.getPrice()+3.80;
    }
}
