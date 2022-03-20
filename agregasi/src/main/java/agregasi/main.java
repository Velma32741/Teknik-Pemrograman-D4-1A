/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregasi;

/**
 *
 * @author FAKHRI
 */

import agregasi.Tata.Planet;
import agregasi.Tata.SolarSystem;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //Deklarasi Planet
        List<Planet> planet = new ArrayList<>();
        //Deklarasi object planet
        Planet planet1 = new Planet(101, 1, "Merkurius");
        Planet planet2 = new Planet(102,2, "Venus");
        Planet planet3 = new Planet(103, 3, "Bumi");
        Planet planet4 = new Planet(104, 4, "Mars");
        Planet planet5 = new Planet(105,5,"Yupiter");

        //Deklarasi object solar system
        SolarSystem solSys = new SolarSystem("SS100", "Solar System");

        //Menghubungkan dengan cara Agregasi
        planet.add(planet1);
        planet.add(planet2);
        planet.add(planet3);
        planet.add(planet4);
        planet.add(planet5);
        planet.add(new Planet(106, 6, "Saturnus"));
        planet.add(new Planet(107, 7, "Uranus"));
        planet.add(new Planet(108, 8, "Neptunus"));

        solSys.setPlanets(planet);
        solSys.getData();

    }
}