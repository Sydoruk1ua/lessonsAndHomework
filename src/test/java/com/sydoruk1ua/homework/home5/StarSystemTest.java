package com.sydoruk1ua.homework.home5;

import com.sydoruk1ua.homework.home5.solarsystem.SolarSystem;
import com.sydoruk1ua.homework.home5.solarsystem.SunStar;
import com.sydoruk1ua.homework.home5.solarsystem.moons.MoonOfEarth;
import com.sydoruk1ua.homework.home5.solarsystem.planets.Earth;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StarSystemTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private StarSystem starSystem;

    @Before
    public void initialize() {
        starSystem = new SolarSystem("SolarSystem");
        Star starSun = new SunStar("Sun", 2500.0, 100_000.0, 150_000.0, 5_000.0);
        Planet earthPlanet = new Earth("Earth", 1000.0, 50_000.0, 107_000.0);
        Planet venusPlanet = new Earth("Venus", 900.0, 58_000.0, 99_000.0);
        Planet marsPlanet = new Earth("Mars", 1500.0, 43_000.0, 200_000.0);
        Moon moon = new MoonOfEarth("EarthMoon", 500.0, 1000.0, 50000.5);
        earthPlanet.setMoons(new ArrayList<Moon>(Arrays.asList(moon)));
        starSystem.setStars(new ArrayList<Star>(Arrays.asList(starSun)));
        starSystem.setPlanets(new ArrayList<>(Arrays.asList(earthPlanet, venusPlanet, marsPlanet)));

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintCountPlanetsInStarSystem() {
        starSystem.printCountPlanetsInStarSystem();
        assertEquals("In SolarSystem star system there is/are 3 planet/planets\r\n", outContent.toString());
    }


    @Test
    public void shouldPrintNameofStarInStarSystem() {
        starSystem.printNameofStarInStarSystem();
        assertEquals("The name of star in SolarSystem star system is Sun\r\n", outContent.toString());
    }



    @Test
    public void shouldAddPlanetToStarSystem() {
        Planet neptunePlanet = new Earth("Neptune", 800.0, 98_000.0, 199_000.0);
        starSystem.addPlanetToStarSystem(neptunePlanet);
        assertEquals(4, starSystem.getPlanets().size());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}