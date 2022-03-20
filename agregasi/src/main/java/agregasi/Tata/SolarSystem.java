package agregasi.Tata;

/**
 *
 * @author FAKHRI
 */
import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private String id;
    private String nama;
    private List <Planet> planets = new ArrayList<>();

    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getTotalMember(){
        return planets.size();
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void getData(){
        System.out.println("Nama Solar System\t: " + getNama());
        System.out.println("ID Solar System\t\t: " + getId());
        System.out.println("Jumlah Planet\t\t: " + getTotalMember());
        System.out.println("List Planet\t: ");
        for(Planet pla : planets){
            System.out.println("\t - Nama\t: " + pla.getNamaPlanet());
            System.out.println("\t   ID\t: " + pla.getIdPlanet());
            System.out.println("\t   Urutan\t: "+ pla.getUrutanPlanet());
        }
    }
}