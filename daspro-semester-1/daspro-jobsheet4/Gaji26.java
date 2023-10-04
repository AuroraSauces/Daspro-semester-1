import java.util.Scanner;

public class Gaji26 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int JmlMasuk,JmlTdkMasuk,Totgaji,gaji,potgaji;
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        JmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk = input.nextInt();
        System.out.println("Berapa gaji anda?");
        gaji = input.nextInt();
        System.out.println("Berapa potongan gaji perhari jika tidak masuk?");
        potgaji = input.nextInt();
        Totgaji = (JmlMasuk*gaji)-(potgaji*JmlTdkMasuk);
        System.out.println("Gaji Anda adalah "+Totgaji);
    }
}
