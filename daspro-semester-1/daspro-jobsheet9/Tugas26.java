import java.util.Scanner;

public class Tugas26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: ");
        int n = input.nextInt();


        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            sum += i;
        }
        double average = (double) sum / n;

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + average);

        input.close();
    }
}
