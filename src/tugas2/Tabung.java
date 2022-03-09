package tugas2;

public class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi;

    public Tabung(double r, double t) {
        super(r);
        tinggi = t;
    }

    public void setTinggi(int t) {
        tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double Volume() {
        return PHI * (super.getJari() * super.getJari()) * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (PHI * super.getJari()) * (super.getJari() + tinggi);
    }
}
