import java.util.Scanner;

public class rekursif326 {
    static double hitunglaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitunglaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun;
        double saldoawal;
        System.out.println("Jumlah saldo awal : ");
        saldoawal = sc.nextInt();
        System.out.println("Lamanya investasi (tahun) : ");
        tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah" + tahun + " tahun: ");
        System.out.println(hitunglaba(saldoawal, tahun));
        sc.close();
    }

}
