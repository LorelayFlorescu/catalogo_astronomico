package com.example.catalogoastronomico;

/**
 *
 * @author Lorena-Ioana Florescu, X7261992H(IOT)
 * @version 29/09/2020(2020)
 *
 */

public class EstrellaConTipo extends Estrella{

    private TipoEstrella tipo;

    public EstrellaConTipo(String nombre, double brillo, double distancia, int planetas, Galaxia galaxia, TipoEstrella tipo){

        super(nombre, brillo, distancia, planetas, galaxia);
        this.tipo=tipo;

    }

    public TipoEstrella getTipo(){
        return tipo;
    }

    public void setTipo(TipoEstrella tipo){
        this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "objeto-Astro {nombre: " + getNombre() + ", tipo: " + getClass().getSimpleName() + ", brillo: " +
                getBrillo() + ", distancia: " + getDistancia() + ", planetas: " + getPlanetas() +
                ", galaxia: " + getGalaxia().getNombre() + ", info: " + tipo.getNombre() + " \"" + tipo.getUrl() + "\""+"}";
    }
}
