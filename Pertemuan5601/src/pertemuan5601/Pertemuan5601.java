package pertemuan5601;

/**
 *
 * @author Made Artha
 * TGL: 26-04-2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia johan = new manusia("L");
        johan.warnakulit="brown";
        johan.SetWarnaRambut("hitam");
        
        manusia yani = new manusia("P");
        
    }
    
}

class manusia{
    public String warnakulit="";
    private String warnarambut = "";
    private String jeniskelamin="";
    
    //constructor
    public manusia(String jkel){
        this.jeniskelamin = jkel;
    }
    
    public void SetWarnaRambut(String warna){
        //menambahkan kode identifikasi
        this.warnarambut = warna;
    }
}
