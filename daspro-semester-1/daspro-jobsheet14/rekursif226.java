import java.util.Scanner;
public class rekursif226 {
    static int hitungpangkat(int x, int y){
        if (y==0){
            return (1);
        } else {
            return (x*hitungpangkat(x, y-1));
        }
    }  public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bilangan,pangkat;
        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();
        System.out.println("Hasil : " +hitungpangkat(bilangan, pangkat));
        
        int hasil = hitungpangkat(bilangan, pangkat);
        System.out.print("Deret perhitungan pangkat: ");
        for (int i = 1; i <= pangkat; i++) {
            System.out.print(bilangan);
            if (i < pangkat) {
                System.out.print("x");
            }
        }
        System.out.println(" = " + hasil);
        sc.close();
    }
}
