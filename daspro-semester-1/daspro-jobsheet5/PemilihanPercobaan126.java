import java.util.Scanner;

public class PemilihanPercobaan126 {

    public static void main(String[] args) {
         Scanner input00 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input00.nextInt();

        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + jenisAngka);
    }
}