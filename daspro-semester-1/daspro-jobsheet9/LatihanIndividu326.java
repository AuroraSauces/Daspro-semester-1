import java.util.Scanner;

public class LatihanIndividu326 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] bulan = {"januari","Februari","Maret","April","Mei","Juni","Juli","agustus",
        "September","Oktober","November","desember"};

        System.out.print("Masukkan angka dari 1-12 : ");
        int angka = input.nextInt();
        if (angka >=1 && angka <=12) {
            System.out.println( "Bulan yang anda pilih adalah : " + bulan[angka-1] );
  
        } else {
            System.out.println("Angka yang dimasukkan tidak valid");
        } input.close();
    }
} 

