import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner Nilai = new Scanner(System.in);
        String[] namasiswa;
        int[] nilai;
        int siswa;
        String[] mataPelajaran = {
            "Biologi", "Fisika", "Kimia", "Matematika", "Bahasa Inggris",
            "Bahasa Jepang", "Agama", "PJOK", "Bahasa Indonesia"
        };

        System.out.println("Masukkan jumlah siswa");
        siswa = Nilai.nextInt();
        namasiswa = new String[siswa];
        nilai = new int[siswa * mataPelajaran.length];

        for (int i = 0; i < siswa; i++) {
            System.out.println("Nama");
            namasiswa[i] = Nilai.next();
            for (int j = 0; j < mataPelajaran.length; j++) {
                System.out.println("Masukkan nilai " + mataPelajaran[j] + ":");
                nilai[i * mataPelajaran.length + j] = Nilai.nextInt();
            }
        }

        for (int i = 0; i < siswa; i++) {
            int sum = 0;
            for (int j = 0; j < mataPelajaran.length; j++) {
                sum += nilai[i * mataPelajaran.length + j];
            }
            int Nilaiakhir = sum / mataPelajaran.length;

            if (Nilaiakhir > 85) {
                System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Nilaimu A");
            } else if (Nilaiakhir > 80) {
                System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Nilaimu B+");
            } else if (Nilaiakhir > 75) {
                System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Nilaimu B");
            } else if (Nilaiakhir > 70) {
                System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Nilaimu C");
            } else {
                System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Nilaimu D");
            }
        }
        Nilai.close();
    }
}
