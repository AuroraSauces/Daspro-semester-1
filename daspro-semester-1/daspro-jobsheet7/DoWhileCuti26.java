import java.util.Scanner;

public class DoWhileCuti26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahcuti,jumlahhari;
        String konfirmasi;

        System.out.print("jatah cuti: ");
        jatahcuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda Ingin Mengambil cuti (Y/T)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("Y")) {
            System.out.print("Jumlah hari: ");
            jumlahhari =sc.nextInt();
            
            if (jumlahhari <= jatahcuti) {
                jatahcuti -=jumlahhari;
                System.out.println("Sisa Jatah cuti: " +  jatahcuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak  mencukupi");
              
            }
        } else {
            System.out.println("Ok selamat bekerja :)");
        }
    } while (konfirmasi.equalsIgnoreCase("y"));
    
}
}
