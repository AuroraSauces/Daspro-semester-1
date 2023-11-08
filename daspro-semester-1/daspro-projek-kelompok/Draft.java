import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Username, Password;
        String[] namasiswa = null;
        int[][] nilai = null;
        int siswa = 0;
        String[] mataPelajaran = {
            "Biologi", "Fisika", "Kimia", "Matematika", "Bahasa Inggris",
            "Bahasa Jepang", "Agama", "PJOK", "Bahasa Indonesia"
        };

        boolean continueLogin = true;

        while (continueLogin) {
            System.out.println("Masukkan Username");
            Username = sc.nextLine();
            System.out.println("Masukkan Password");
            Password = sc.nextLine();

            if (Username.equalsIgnoreCase("Dosen") && Password.equalsIgnoreCase("Admin")) {
                System.out.println("Login Dosen Berhasil");
                System.out.println("Masukkan jumlah siswa");
                siswa = sc.nextInt();
                sc.nextLine();

                if (namasiswa == null) {
                    namasiswa = new String[siswa];
                    nilai = new int[siswa][mataPelajaran.length];
                }

                for (int i = 0; i < siswa; i++) {
                    System.out.println("Nama Mahasiswa " + (i + 1) + ":");
                    namasiswa[i] = sc.nextLine();
                    for (int j = 0; j < mataPelajaran.length; j++) {
                        System.out.println("Masukkan nilai " + mataPelajaran[j] + ":");
                        nilai[i][j] = sc.nextInt();
                    }
                    sc.nextLine();
                }

                for (int i = 0; i < siswa; i++) {
                    int sum = 0;
                    for (int j = 0; j < mataPelajaran.length; j++) {
                        sum += nilai[i][j];
                    }
                    int Nilaiakhir = sum / mataPelajaran.length;

                    if (Nilaiakhir > 85) {
                        System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Bernilai A");
                    } else if (Nilaiakhir > 80) {
                        System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Bernilai B+");
                    } else if (Nilaiakhir > 75) {
                        System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Bernilai B");
                    } else if (Nilaiakhir > 70) {
                        System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Bernilai C");
                    } else {
                        System.out.println(namasiswa[i] + ": Nilai akhir " + Nilaiakhir + " Bernilai D");
                    }
                }
            } else if (Username.equalsIgnoreCase("Mahasiswa") || Username.equalsIgnoreCase("Mahasiswa2") &&
                    Password.equalsIgnoreCase("Ketu")) {
                boolean found = false;

                for (int i = 0; i < siswa; i++) {
                    if (namasiswa[i].equalsIgnoreCase(Username)) {
                        found = true;
                        int sum = 0;
                        for (int j = 0; j < mataPelajaran.length; j++) {
                            sum += nilai[i][j];
                        }
                        int Nilaiakhir = sum / mataPelajaran.length;

                        System.out.println("Berikut adalah nilai dari kelas kamu:");
                        System.out.println("Nilai akhir mahasiswa adalah " + Nilaiakhir);
                        break;
                    }
                }
                
                if (!found) {
                    System.out.println("Mahasiswa dengan username '" + Username + "' tidak ditemukan.");
                }
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }

            System.out.println("Mau kembali ke login? y/n");
            String kembali = sc.nextLine();

            if (kembali.equalsIgnoreCase("n")) {
                continueLogin = false;
            }
        }

        sc.close();
    }
}
