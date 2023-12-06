import java.util.Scanner;

public class nilaimahasiswa26 {
    static Scanner sc = new Scanner(System.in);
    static String[] namaMhswa;
    static int[][] nilaiMhswa;
    
    static void inputNilai(){
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        namaMhswa = new String[jumlahMahasiswa];
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();
        nilaiMhswa = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMhswa[i] = sc.next();
            System.out.println("Masukkan nilai Mahasiswa atas nama " + namaMhswa[i]);
            for (int j = 0; j < jumlahTugas; j++){
                System.out.print("Tugas ke-" + (j + 1) + " : ");
                nilaiMhswa[i][j] = sc.nextInt();
            }
        }
    }

    static void dataNilaiMhswa(){
        System.out.println("Data Nilai Tugas mahasiswa adalah :");
        for (int i = 0; i < namaMhswa.length; i++) {
            System.out.print("Mahasiswa " + namaMhswa[i] + "\t: ");
            for (int j = 0; j < nilaiMhswa[i].length; j++) {
                System.out.print(nilaiMhswa[i][j] + ", ");
            }
            System.out.println();
        }
    }

    static int mingguTertinggi(){
        int nilaiTertinggi = 0;
        int MingguTertinggi = 0;

        for(int j = 0; j < nilaiMhswa[0].length ; j++) {
            int totalNilaiMinggu = 0;
            for(int i = 0; i < namaMhswa.length; i++){
                totalNilaiMinggu += nilaiMhswa[i][j];
            } if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                MingguTertinggi = j;
            }
        }
        return MingguTertinggi;
    }
    public static void main(String[] args) {
    inputNilai();
    System.out.println();
    dataNilaiMhswa();
    printNilaiTertinggiMhswa();
    }
    static void printNilaiTertinggiMhswa(){
        int nilaiTertinggi = 0;
        int Mhswa = 0;
        int Minggu = 0;

        for(int i = 0; i < namaMhswa.length; i++){
            for(int j = 0; j < nilaiMhswa[i].length; j++){
                if (nilaiMhswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhswa[i][j];
                    Mhswa = i;
                    Minggu = j;
                }
            } 
        }
            System.out.println("\nNilai tertinggi diperoleh mahasiswa atas nama " + namaMhswa[Mhswa]);
            System.out.println("Nilai tertinggi terdapat pada tugas ke-" + (Minggu + 1) + " dengan nilai " + nilaiTertinggi);
    }
}
