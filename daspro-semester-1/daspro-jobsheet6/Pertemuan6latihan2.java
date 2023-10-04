import java.util.Scanner;

public class Pertemuan6latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisbuku, banyakbuku;
        double distot ;

        System.out.println("List buku yang tersedia ");
        System.out.println("1. Kamus");
        System.out.println("2. Novel");
        System.out.println("3. Buku lain");
        System.out.print("Masukkan nomor buku : ");
        jenisbuku = sc.nextInt();

        if (jenisbuku == 1) {
            System.out.println("Berapa buku Kamus yang anda beli? ");
            banyakbuku = sc.nextInt();

            if (banyakbuku > 2) {
                distot = 10 + 2; // Diskon 12% untuk pembelian lebih dari 2 buku Kamus
            } else {
                distot = 10; // Diskon 10% untuk pembelian 2 atau kurang buku Kamus
            }

            System.out.println("Diskon total Kamus anda adalah " + distot +"%");
        } else if (jenisbuku == 2) {
            System.out.println("Berapa buku Novel yang anda beli? ");
            banyakbuku = sc.nextInt();

            if (banyakbuku > 3) {
                distot = 7 + 2; // Diskon 15% untuk pembelian lebih dari 2 buku Novel
            } else {
                distot = 7 + 1; // Diskon 3% untuk pembelian 2 atau kurang buku Novel
            }

            System.out.println("Diskon total Novel anda adalah " + distot);
        } else if (jenisbuku == 3) {
            System.out.println("Masukkan jumlah diskon anda");
            banyakbuku = sc.nextInt();

            if (banyakbuku > 2) {
                distot = 5; // Diskon 7% untuk pembelian lebih dari 2 buku jenis lain
            } else {
                distot = 0; // Diskon 3% untuk pembelian 2 atau kurang buku jenis lain
            }

            System.out.println("Diskon anda adalah " + distot);
        } else {
            System.out.println("Nomor buku tidak valid.");
        }

        sc.close();
    }
}
