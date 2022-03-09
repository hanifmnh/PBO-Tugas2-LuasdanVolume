package tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihMenu;
        double p, l, t, r;
        int ulang;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("====================");
            System.out.println("     MENU UTAMA     ");
            System.out.println("====================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilihMenu = input.nextInt();

            switch (pilihMenu) {
                case 1:
                    System.out.print("\nInput Panjang\t: ");
                    p = input.nextInt();
                    System.out.print("Input Lebar\t: ");
                    l = input.nextInt();
                    System.out.print("Input Tinggi\t: ");
                    t = input.nextInt();

                    Balok balok = new Balok(p, l, t);

                    System.out.println("\nLuas Persegi Panjang\t\t= " + balok.Luas());
                    System.out.println("Keliling Persegi Panjang\t= " + balok.Keliling());
                    System.out.println("Volume Balok\t\t\t= " + balok.Volume());
                    System.out.println("Luas Permukaan Balok\t\t= " + balok.luasPermukaan());
                    break;

                case 2:
                    System.out.print("\nInput Tinggi\t: ");
                    t = input.nextInt();
                    System.out.print("Input Jari-jari\t: ");
                    r = input.nextInt();
                    Tabung tabung = new Tabung(r, t);

                    System.out.format("\nLuas Lingkaran\t\t= %.2f\n", tabung.Luas());
                    System.out.format("Keliling Lingkaran\t= %.2f\n", tabung.Keliling());
                    System.out.format("Volume Tabung\t\t= %.2f\n", tabung.Volume());
                    System.out.format("Luas Permukaan Tabung\t= %.2f\n", tabung.luasPermukaan());
                    break;

                case 3:
                    input.close();
                    System.exit(0);
                    break;
            }

            System.out.print("\nUlangi? (Ya: 1 || Tidak: 0) ");
            ulang = input.nextInt();
            System.out.println();
        } while (ulang == 1);
        input.close();
    }
}
