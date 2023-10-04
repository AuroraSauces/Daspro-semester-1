import java.util.Scanner;

public class Pemilihan2Percobaan126 {

    public static void main(String[] args) {
        Scanner th = new Scanner(System.in);
        double tahun;
        System.out.print("Masukkan tahun:  ");
        tahun = th.nextDouble();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
