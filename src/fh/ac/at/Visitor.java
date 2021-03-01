package fh.ac.at;

public interface Visitor {
    public double visit(Liqour liqourItem);
    public double visit(Tabaco tabacoItem);
    public double visit(Necessity necessityItem);
}
