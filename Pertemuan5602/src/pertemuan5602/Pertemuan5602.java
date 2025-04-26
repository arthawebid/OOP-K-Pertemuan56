package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Made Arthe
 * TGL; 26-04-2025
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        
        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();
        
        System.out.print("Nilai Alas: ");
        SegiTiga01.alas = m.nextInt();
        System.out.print("Nilai Tinggi: ");
        SegiTiga01.tinggi = m.nextInt();
        
        System.out.println("Hitung Luas Bangun Segitiga");
        System.out.println("Luas = ½ * Alas * Tinggi");
        System.out.printf("     = ½ * %d * %d\n",SegiTiga01.alas,SegiTiga01.tinggi );
        System.out.printf("     = %.2f\n",SegiTiga01.HitungLuas());
        
    }
    
}
