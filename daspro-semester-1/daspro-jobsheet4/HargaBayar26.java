import java.util.Scanner;
public class HargaBayar26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk;
        int harga,jumlah,jmlhal;
        double dis,total,bayar,jmldis;
        System.out.println("masukkan merek buku");
        merk = input.next();
        System.out.println("masukkan jumlah halaman buku");
        jmlhal = input.nextInt();
        System.out.println("masukkan harga yang dibeli");
        harga = input.nextInt();
        System.out.println("masukkan jumlah barang yang dibeli");
        jumlah = input.nextInt();
        System.out.println("Berapa Diskon yang diberikan?");
        dis = input.nextDouble();
        total = harga*jumlah;
        jmldis = total*dis;
        bayar = total-jmldis;
        System.out.println("Diskon yang anda terima adalah " + jmldis);
        System.out.println("Jumlah yang harus dibayar adalah "+ bayar);
    }
    
}
