import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.print("Nilai uas    ");
        float uas = input00.nextFloat();
        System.out.print("Nilai uts    ");
        float uts = input00.nextFloat();
        System.out.print("Nilai kuis   ");
        float kuis = input00.nextFloat();
        System.out.print("Nilai tugas  ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
        
        String grades;
        if (total > 80) 
            grades = "A";
        else if (total > 73) 
            grades = "B+";
        else if (total > 65)
            grades = "B";
        else if (total > 50)
            grades = "C";
        else if (total > 39)
            grades = "D";
        else grades = "E";
           
        System.out.println("Nilai anda: " + total + " Grade anda " + grades);

    }
    
}
