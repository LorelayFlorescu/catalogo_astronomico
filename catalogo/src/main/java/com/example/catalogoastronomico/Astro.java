package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author Lorena-Ioana Florescu, X7261992H (IOT)
 * @version 28/09/(2020)
 *
 */

public class Astro {
    private String nombre;
    private double brillo;
    private double distancia;


    public Astro(){
        nombre = "Sirius";
        brillo = -1.42;
        distancia = 8.7;
    }

    public Astro(String nombre, double brillo, double distancia){

        this.nombre = nombre;
        this.brillo = brillo;
        this.distancia = distancia;
    }

    public void setBrillo(double brillo){
        this.brillo = brillo;
    }

    public void setNombre(String nombre){ this.nombre = nombre; }

    public void setDistancia(double distancia) { this.distancia = distancia; }

    public double getBrillo(){
        return brillo;
    }

    public double getDistancia(){ return distancia; }

    public String getNombre() { return nombre; }

    public boolean masDistante(Astro otro){
        return (this.distancia>otro.getDistancia());
    }

    public int masBrillante(Astro otro){
        if(this.brillo>otro.getBrillo())
            return 1;
        if(this.brillo<otro.getBrillo())
            return (-1);

        return 0;
    }

    public String visibleCon(){
        if(brillo<5)
            return "a simple vista";
        if(brillo>=5 && brillo<7)
            return "con prismáticos";
        if(brillo>=7 && brillo<25)
            return "con telescopio";
        if(brillo>=25)
            return "con grandes telescopios";
        return "error visibilidad";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Astro astro = (Astro) o;
        return Double.compare(astro.brillo, brillo) == 0 &&
                Double.compare(astro.distancia, distancia) == 0 &&
                Objects.equals(nombre, astro.nombre);
    }

    @Override
    public String toString(){
        return "objeto-Astro {nombre: " + nombre + ", brillo: " +
                brillo + ", distancia: " + distancia + "}";
    }


}