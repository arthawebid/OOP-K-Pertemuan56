package pertemuan5602;

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
        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();
        SegiTiga01.alas = 8;
        SegiTiga01.tinggi = 5;
        System.out.print("Luas Segi tiga: "+SegiTiga01.HitungLuas() );
    }
    
}
