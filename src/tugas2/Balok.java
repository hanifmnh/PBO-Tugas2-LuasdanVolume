package tugas2;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double tinggi;

    public Balok(double p, double l, double t) {
        super(p, l);
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
        return super.Luas() * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (super.Luas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
}
