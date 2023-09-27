import java.util.Scanner;
public class PemilihanPercobaan204 {

    public static void main (String[] args){
        Scanner input04 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input04.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input04.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input04.nextFloat();
        System.out.print("Nilai tugas   :");
        float tugas = input04.nextFloat();

        float total = (uas * 0.4F ) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi ";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total >80) {
        System.out.println("Kualifikasi nilai sangat baik dengan predikit 'A' ");
        } else if (total >=73) {
        System.out.println("Kualifikasi nilai lebih dari baik dengan predikat 'B+' ");
        } else if (total >=65) {
        System.out.println("Kualifikasi nilai baik dengan predikat 'B' ");  
        } else if (total >=60) {
        System.out.println("Kualifikasi nilai lebih dari cukup dengan predikat 'C+' ");
        } else if (total >=50) {
        System.out.println("Kualifikasi nilai cukup dengan predikat 'C' ");
        } else if (total >=39) {
        System.out.println("Kualifikasi nilai kurang dengan predikat 'D' ");
        } else if (total <=39) {
        System.out.println("Kualifikasi nilai lebih dari kurang dengan predikat 'E' ");
        }

        }
        }
