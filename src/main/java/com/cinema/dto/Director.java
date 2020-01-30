package com.cinema.dto;

import java.io.Serializable;
import java.util.Objects;

public class Director implements Serializable {
    private static final long serialVersionUID = 2L;

    private int idDirector;
    private String nameDirector;
    private String surnameDirector;

    public Director(int idDirector, String nameDirector, String surnameDirector) {
        this.idDirector = idDirector;
        this.nameDirector = nameDirector;
        this.surnameDirector = surnameDirector;
    }

    public int getIdDirector() {
        return idDirector;
    }
    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }
    public String getNameDirector() {
        return nameDirector;
    }
    public void setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    }
    public String getSurnameDirector() {
        return surnameDirector;
    }
    public void setSurnameDirector(String surnameDirector) {
        this.surnameDirector = surnameDirector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return idDirector == director.idDirector;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDirector);
    }

    @Override
    public String toString() {
        return "Director{" +
                "idDirector=" + idDirector +
                ", nameDirector='" + nameDirector + '\'' +
                ", surnameDirector='" + surnameDirector + '\'' +
                '}';
    }
}
