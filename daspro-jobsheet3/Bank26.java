import java.util.Scanner;
public class Bank26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tabuawal,lama;
        double  prosbunga =0.02 , bunga , jmlakhir;
        System.out.println("Masukkan jumlah Tabungan awal anda");
        tabuawal = input.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama = input.nextInt();

        bunga = lama*prosbunga*tabuawal;
        jmlakhir = bunga+tabuawal;
        System.out.println("Bunga adalah " +bunga);
        System.out.println("Jumlah tabungan akhir anda " + jmlakhir);
     
        input.close();
    }
    
}
