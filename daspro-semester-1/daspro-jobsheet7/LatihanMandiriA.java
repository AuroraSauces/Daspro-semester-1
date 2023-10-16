import java.util.Scanner;

public class LatihanMandiriA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,kelamin;
        int i;
        

        for (i = 1 ; i <=3; i++ ){

        System.out.println("Masukkan nama anda");
        nama = sc.next();

        System.out.println("Masukkan jenis kelamin L/P");
        kelamin = sc.next();



            if (kelamin.equalsIgnoreCase("P"))
            System.out.println("Data " + nama +" "+ kelamin );

        } 
        sc.close(); 
    } 
}