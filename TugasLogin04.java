import java.util.Scanner;

public class TugasLogin04 {
    public static void main(String[] args) {
        String usernameBenar = "Aprilia";
        String passwordBenar = "12345";

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = input.nextLine();

        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Dapat masuk ke system");
        } else {
            System.out.println("User dan Password salah");
        }

    
    }
}
