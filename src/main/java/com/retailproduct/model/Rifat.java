package com.retailproduct.model;

import java.util.Objects;

public class Rifat {

    String name;
    String address;
    String phNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public Rifat(String name, String address, String phNumber) {
        this.name = name;
        this.address = address;
        this.phNumber = phNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rifat rifat = (Rifat) o;
        return name.equals(rifat.name) &&
                address.equals(rifat.address) &&
                phNumber.equals(rifat.phNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phNumber);
    }

    @Override
    public String toString() {
        return "Rifat{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phNumber='" + phNumber + '\'' +
                '}';
    }
}
