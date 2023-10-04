import java.util.Scanner;

public class DasproProjekkelompokJobsheet3 {
    public static void main(String[] args) {
        Scanner Nilai = new Scanner(System.in);

        String namasiswa;
        int biologi,fisika,kimia,matematika,Bahasaindonesia,Bahasajepang,agama,Pjok,Bahasainggris,Nilaiakhir;

        System.out.println("Namamu");
        namasiswa = Nilai.next();
        System.out.println("biologi");
        biologi = Nilai.nextInt();
        System.out.println("Fisika");
        fisika = Nilai.nextInt();
        System.out.println("Kimia");
        kimia = Nilai.nextInt();
        System.out.println("Matematika");
        matematika = Nilai.nextInt();
        System.out.println("Bahasa inggris");
        Bahasainggris = Nilai.nextInt();
        System.out.println("Bahasa Jepang");
        Bahasajepang = Nilai.nextInt();
        System.out.println("agama");
        agama = Nilai.nextInt();
        System.out.println("Pjok");
        Pjok = Nilai.nextInt();
        System.out.println("Bahasaindonesia");
        Bahasaindonesia = Nilai.nextInt();

        Nilaiakhir = (biologi+fisika+kimia+matematika+Bahasaindonesia+Bahasajepang+agama+Pjok+Bahasainggris)/9;
        System.out.println("Nilai akhir " + Nilaiakhir);
Nilai.close();
    }    
}