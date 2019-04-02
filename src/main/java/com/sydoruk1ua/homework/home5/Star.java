package com.sydoruk1ua.homework.home5;

import java.util.Objects;

public abstract class Star {
    private String name;
    private Double radius;
    private Double mass;
    private Double speedInSpace;          //in km/h
    private Double temperatureOnSurface;  //in celsius
    private StarSystem starSystem;

    public Star(String name, Double radius, Double mass, Double speedInSpace, Double temperatureOnSurface) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.speedInSpace = speedInSpace;
        this.temperatureOnSurface = temperatureOnSurface;
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

    public Double getTemperatureOnSurface() {
        return temperatureOnSurface;
    }

    public void setTemperatureOnSurface(Double temperatureOnSurface) {
        this.temperatureOnSurface = temperatureOnSurface;
    }

    public StarSystem getStarSystem() {
        return starSystem;
    }

    public void setStarSystem(StarSystem starSystem) {
        this.starSystem = starSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return Objects.equals(name, star.name) &&
                Objects.equals(radius, star.radius) &&
                Objects.equals(mass, star.mass) &&
                Objects.equals(speedInSpace, star.speedInSpace) &&
                Objects.equals(temperatureOnSurface, star.temperatureOnSurface) &&
                Objects.equals(starSystem, star.starSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius, mass, speedInSpace, temperatureOnSurface, starSystem);
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", starSystem=" + starSystem +
                '}';
    }
}
