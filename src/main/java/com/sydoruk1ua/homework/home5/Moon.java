package com.sydoruk1ua.homework.home5;

import java.util.Objects;

public abstract class Moon {
    private String name;
    private Double radius;
    private Double mass;
    private Double speedInSpace;   //in km/h
    private Planet planetOwner;

    public Moon(String name, Double radius, Double mass, Double speedInSpace) {
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

    public Planet getPlanetOwner() {
        return planetOwner;
    }

    public void setPlanetOwner(Planet planetOwner) {
        this.planetOwner = planetOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moon moon = (Moon) o;
        return Objects.equals(name, moon.name) &&
                Objects.equals(radius, moon.radius) &&
                Objects.equals(mass, moon.mass) &&
                Objects.equals(speedInSpace, moon.speedInSpace) &&
                Objects.equals(planetOwner, moon.planetOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius, mass, speedInSpace, planetOwner);
    }

    @Override
    public String toString() {
        return "Moon{" +
                "name='" + name + '\'' +
                ", planetOwner=" + planetOwner +
                '}';
    }
}
