public class programku {
    public static void Tampilkanhinggakei (int i ){
        for (int j = 1; j <=i ; j++){
            System.out.println(j);
        }
    }
    public static int jumlah (int bil1 , int bil2){
        return (bil1+bil2);
    }
    public static void Tampiljumlah (int bil1 , int bil2){
        Tampilkanhinggakei(jumlah(bil1 , bil2));
    }
    public static void main(String[] args) {
        int temp = jumlah (1, 1);
        Tampiljumlah (temp , 5);
    }
}
