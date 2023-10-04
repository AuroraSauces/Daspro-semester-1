import java.util.Scanner;

public class Individu1 {
    public static void main(String[] args) {
        Scanner jarak = new Scanner(System.in);

        int jarag;

        System.out.print("Masukkan jarak   :   ");
        jarag = jarak.nextInt();

        if (jarag < 5) {
            System.out.println("Sebaiknya kamu memakai melee weapon");
        } else {
            System.out.println("Sebaiknya kamu memakai range weapon");
        }    
    }
}
    

