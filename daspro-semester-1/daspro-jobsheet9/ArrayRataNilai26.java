import java.util.Scanner;

public class ArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();

    int [] nilaiMhs = new int[jumlahMhs];
    int mhsLulus = 0, mhstdkLulus = 0;
    double total1 = 0, rata2, total2 = 0, rata3;

        for (int i = 0; i < nilaiMhs.length;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" :");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70){
                total1 += nilaiMhs[i];
                mhsLulus++;
        }else{
                total2 += nilaiMhs[i];
                mhstdkLulus++;
            }
        }
        
        rata2 = total1/mhsLulus;
        rata3 = total2/mhstdkLulus;
        System.out.println("Rata-rata nilai lulus = "+rata2);
        System.out.println("Rata-rata nilai tidak lulus = "+rata3);
        


        sc.close();
    }
}