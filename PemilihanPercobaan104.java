import java.util.Scanner;
public class PemilihanPercobaan104 {

    public static void main(String[] args) {
         Scanner input04 = new Scanner(System.in);
         int angka;
         System.out.print("Masukkan angka: ");
         angka = input04.nextInt();

         int nomor = 20;

         String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
         System.out.println("Angka ini adalah " + hasil);
    }
}