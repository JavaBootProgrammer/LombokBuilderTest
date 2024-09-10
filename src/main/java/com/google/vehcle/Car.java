package com.google.vehcle;

import lombok.Builder;
import lombok.Singular;

import java.util.List;
import java.util.Set;

@Builder
public class Car {

    private String id;
    @Builder.Default
    private String make="Toyota";
    @Builder.Default
    private String model="Camry";
    @Singular
    private Set<String> Owners;

    public Car(String id, String make, String model, Set<String> owners) {
        this.id = id;
        this.make = make;
        this.model = model;
        Owners = owners;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", Owners=" + Owners +
                '}';
    }



}
