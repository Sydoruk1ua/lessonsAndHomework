package com.sydoruk1ua.homework.home5.solarsystem;

import com.sydoruk1ua.homework.home5.Planet;
import com.sydoruk1ua.homework.home5.Star;
import com.sydoruk1ua.homework.home5.StarSystem;

import java.util.List;

public class SolarSystem extends StarSystem {
    public SolarSystem(String name) {
        super(name);
    }

    public SolarSystem(String name, List<Star> stars, List<Planet> planets) {
        super(name, stars, planets);
    }
}
