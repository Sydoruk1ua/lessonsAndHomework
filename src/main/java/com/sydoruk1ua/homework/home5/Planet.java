package com.sydoruk1ua.homework.home5;

import java.util.List;
import java.util.Objects;

public abstract class Planet {
    private String name;
    private Double radius;
    private Double mass;
    private Double speedInSpace;   //in km/h
    private List<Moon> moons;

    public Planet(String name, Double radius, Double mass, Double speedInSpace) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.speedInSpace = speedInSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getSpeedInSpace() {
        return speedInSpace;
    }

    public void setSpeedInSpace(Double speedInSpace) {
        this.speedInSpace = speedInSpace;
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public void setMoons(List<Moon> moons) {
        this.moons = moons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name) &&
                Objects.equals(radius, planet.radius) &&
                Objects.equals(mass, planet.mass) &&
                Objects.equals(speedInSpace, planet.speedInSpace) &&
                Objects.equals(moons, planet.moons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius, mass, speedInSpace, moons);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }
}
