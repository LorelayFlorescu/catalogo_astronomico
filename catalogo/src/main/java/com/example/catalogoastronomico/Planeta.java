package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author Lorena-Ioana Florescu, X7261992H (IOT)
 * @version 28/09/(2020)
 *
 */
public class Planeta extends Astro {
    private boolean habitado;
    private Estrella estrella;

    public Planeta(String nombre, double brillo, double distancia, boolean habitado, Estrella estrella){
        super(nombre, brillo, distancia);
        this.habitado=habitado;
        this.estrella=estrella;
    }

    public Estrella getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }

    public boolean isHabitado() {
        return habitado;
    }

    public void setHabitado(boolean habitado) {
        this.habitado = habitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Planeta planeta = (Planeta) o;
        return habitado == planeta.habitado &&
                Objects.equals(estrella, planeta.estrella);
    }

    @Override
    public String toString() {

        return "objeto-Astro {nombre: " + getNombre() + ", tipo: " + getClass().getSimpleName() + ", brillo: " +
                getBrillo() + ", distancia: " + getDistancia() + ", habitado: " + habitado +
                ", estrella: " + estrella.getNombre() + "}";
    }
}
