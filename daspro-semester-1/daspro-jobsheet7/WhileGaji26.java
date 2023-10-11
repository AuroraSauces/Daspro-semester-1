import java.util.Scanner;

public class WhileGaji26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahkaryawan,jumlahjamlembur;
        double gajilembur = 0 ,totalgajilembur = 0 ;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahkaryawan = scan.nextInt();

        int i = 0;

        while (i<jumlahkaryawan){
            System.out.print("Pilihan jabatan - Direktur, Manajer , karyawan");
            System.out.print(" Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahjamlembur = scan.nextInt(); 
            i++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajilembur = jumlahjamlembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")){
                gajilembur = jumlahjamlembur * 75000;
            } else  {
            System.out.println("Jawaban tidak valid");}
            totalgajilembur += gajilembur;
        }
        System.out.println("Total gaji lembur: " + totalgajilembur );
    }
    
}
