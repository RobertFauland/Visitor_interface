package fh.ac.at;

public class Main {

    public static void main(String[] args) {
	    TaxVisitor taxCalc = new TaxVisitor();

	    Necessity milk = new Necessity(2.50);
	    Liqour vodka = new Liqour(2.50);
	    Tabaco cigar = new Tabaco(2.50);

		System.out.println(milk.accept(taxCalc) + "\n");
		System.out.println(vodka.accept(taxCalc) + "\n");
		System.out.println(cigar.accept(taxCalc) + "\n");

		TaxVisitorNew taxCalcNew = new TaxVisitorNew();

		System.out.println(milk.accept(taxCalcNew) + "\n");
		System.out.println(vodka.accept(taxCalcNew) + "\n");
		System.out.println(cigar.accept(taxCalcNew) + "\n");
    }
}
