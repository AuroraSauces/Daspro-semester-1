import java.util.Scanner;
public class Percobaan626 {

    static int hitungluas (int pjg , int lb ){
        int luas = pjg*lb;
        return luas;
    }

    static int hitungvolume (int tinggi , int a , int b){
        int volume = hitungluas(a, b)*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int p,l,t,L,vol;
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungluas (p,l);
        System.out.println("Luas persegi panjang adalah : " + L);

        vol =hitungvolume(t, l, p);
        System.out.println("Volume persegi panjang adalah : " + vol);
    }
}
