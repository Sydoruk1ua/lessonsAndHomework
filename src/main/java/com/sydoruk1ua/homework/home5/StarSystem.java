package com.sydoruk1ua.homework.home5;

import java.util.List;
import java.util.Objects;

public abstract class StarSystem {
    private String name;
    private List<Star> stars;
    private List<Planet> planets;
    public StarSystem(String name) {
        this.name = name;
    }

    public StarSystem(String name, List<Star> stars, List<Planet> planets) {
        this.name = name;
        this.stars = stars;
        this.planets = planets;
    }

    public void printCountPlanetsInStarSystem() {
        System.out.println(String.format("In %s star system there is/are %d planet/planets", name, planets.size()));
    }

    public void printNameofStarInStarSystem() {
        if (stars.size() == 1) {
            System.out.println(String.format("The name of star in %s star system is %s", name, stars.get(0).getName()));
        } else {
            System.out.println(String.format("There are %d stars in %s star system. Their names: "
                    , stars.size(), name));
            stars.forEach(star -> System.out.println(star.getName()));
        }
    }

    public void addPlanetToStarSystem(Planet planet) {
        if (!planets.contains(planet)) {
            planets.add(planet);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarSystem that = (StarSystem) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(stars, that.stars) &&
                Objects.equals(planets, that.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stars, planets);
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "name='" + name + '\'' +
                '}';
    }
}
