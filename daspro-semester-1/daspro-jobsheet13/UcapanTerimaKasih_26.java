import java.util.Scanner;
public class UcapanTerimaKasih_26 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan:");
        String NamaOrang = sc.nextLine();
        sc.close();
        return NamaOrang;
    }

    public static String UcapanTambahan (){
        String tmbhn = "Semoga anda tetap menjadi orang yang saya kenal selama ini kedepannya\n";
        return tmbhn;
    }

    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        String Tbh = UcapanTambahan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world. \n" + Tbh +
        "You inspired in me love for learning and made me feel like i could ask you anything" );
    }

    
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
