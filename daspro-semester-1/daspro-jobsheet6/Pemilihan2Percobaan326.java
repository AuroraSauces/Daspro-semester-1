import java.util.Scanner;

public class Pemilihan2Percobaan326 {
    public static void main(String[] args) {
        Scanner noAbsen = new Scanner (System.in);

        String kategori ;
        int penghasilan , gajibersih;
        double pajak = 0;
        System.out.println("Masukkan kategori");
        kategori = noAbsen.nextLine();
        System.out.println("Masukkan besarnya penghasilan");
        penghasilan = noAbsen.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")){
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
            pajak = 0.2;
            gajibersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan bersih : " + gajibersih);
        } else if (kategori.equalsIgnoreCase("Pebisnis")) {
            if (penghasilan <= 2500000)
            pajak = 0.15;
            else if (penghasilan <= 3500000)
            pajak = 0.2;
            else 
            pajak = 0.25;
             gajibersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan bersih : " + gajibersih);
        } else 
        System.out.println("masukan kategori salah");
        }
    }

