package fh.ac.at;

public class TaxVisitorNew implements Visitor{

    public TaxVisitorNew () {}  //Konstruktor


    public double visit(Liqour liqourItem) {
        System.out.println("Liqour");
        return liqourItem.getPrice()+5.20;
    }

    public double visit(Tabaco tabacoItem) {
        System.out.println("Tabaco");
        return tabacoItem.getPrice()+6.50;
    }

    public double visit(Necessity necessityItem) {
        System.out.println("Necessity");
        return necessityItem.getPrice()+7.80;
    }
}
