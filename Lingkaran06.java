import java.util.Scanner;
/**
 * Lingkaran06
 */
public class Lingkaran06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double keliling, luas, phi;

        phi = 3.14;
        System.out.print("Masukkan jari-jari lingkaran: ");
        r = input.nextInt();
        // if (r % 7 == 0) {
        //     phi = 22 / 7;            
        // } else {
        //     phi = 3.14;
        // }
        keliling = 2 * phi * r;
        luas = phi * r * r;
        System.out.println("Keliling lingkaran: " + keliling);
        System.out.println("Luas lingkaran: " + luas);
    }
}