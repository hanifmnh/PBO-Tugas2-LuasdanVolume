package tugas2;

public class Lingkaran implements MenghitungBidang {
    private double jari;

    public Lingkaran(double r) {
        jari = r;
    }

    public void setJari(int r) {
        jari = r;
    }

    public double getJari() {
        return jari;
    }

    @Override
    public double Luas() {
        return PHI * (jari * jari);
    }

    @Override
    public double Keliling() {
        return PHI * (2 * jari);
    }
}
