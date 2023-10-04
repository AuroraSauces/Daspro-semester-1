import java.util.Scanner;

public class Individu2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int corectusername = 123, correctpass =456, username , pass;
        
        System.out.println("Masukkan Username : ");
        username = sc.nextInt();
        System.out.println("Masukkan password :  ");
        pass = sc.nextInt();

        if (username == corectusername && pass == correctpass) {
        System.out.println("Anda Berhasil Login");
        } else {
            System.out.println("Anda gagal login");
        }
    } 
}