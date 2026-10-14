
import java.util.Scanner;
import java.util.Random;

public class CobaJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== PROGRAM ANGKA ACAK ===");
        System.out.print("Masukkan nama kamu: ");
        String nama = input.nextLine();

        int angka = random.nextInt(100) + 1;

        System.out.println("Halo, " + nama + "!");
        System.out.println("Angka acak kamu adalah: " + angka);

        if (angka >= 50) {
            System.out.println("Hasil: Angka besar!");
        } else {
            System.out.println("Hasil: Angka kecil!");
        }

        input.close();
    }
}
