import java.util.Scanner;

public class LinearSearch26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen dalam array: ");
        int n = input.nextInt();

        int[] arrayInt = new int[n];
        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke " + i + ": ");
            arrayInt[i] = input.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } 
        input.close();
    }
}
