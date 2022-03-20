package dependence;

/**
 *
 * @author FAKHRI
 */
public class Main {

    public static void main(String[] args) {
        Konan konan = new Konan();
        Pain pain = new Pain();
        Akatsuki akatsuki = new Akatsuki();
        
        akatsuki.setAkatsuki(konan);
        akatsuki.giveAkatsuki();
        
        akatsuki.setAkatsuki(pain);
        akatsuki.giveAkatsuki();
    }
    
}