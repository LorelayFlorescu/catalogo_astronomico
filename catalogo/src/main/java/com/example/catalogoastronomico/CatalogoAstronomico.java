package com.example.catalogoastronomico;

import org.omg.CORBA.Environment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lorena-Ioana Florescu, X7261992H(IOT)
 * @version 28/09/(2020)
 *
 */
public class CatalogoAstronomico {

    private List<Astro> catalogo;
    private Set<String> galaxias;
    private int numEstrellasSimpleVista;

    public CatalogoAstronomico(){

        catalogo = new ArrayList<Astro>();
        galaxias = new HashSet<String>();
        numEstrellasSimpleVista=0;

    }

    public List getCatalogo() {
        return catalogo;
    }

    public Set getGalaxias() {
        return galaxias;
    }

    public int getNumEstrellasSimpleVista() {
        return numEstrellasSimpleVista;
    }

    //Devuelve true si el astro es una posición válida del catálogo es una estrella visible a simple vista
    public boolean esEstrellaSimpleVista(int i){
        if(i<=catalogo.size() && catalogo.get(i).visibleCon().equals("a simple vista"))
            return true;
        return false;
    }

    //Añade un astro al catálogo (compueba que no esté repetido) y devuelve true si se ha podido añadir
    public boolean anade(Astro a){


    /*
        if(!catalogo.contains(a) || !galaxias.contains(((Galaxia)a).getNombre())) {
            catalogo.add(a);

            if(a.visibleCon().equals("a simple vista"))
                numEstrellasSimpleVista++;

            if(a instanceof Estrella){
                if(!galaxias.contains(((Estrella) a).getGalaxia().getNombre()))
                    galaxias.add(((Estrella) a).getGalaxia().getNombre());
                if(!catalogo.contains(((Estrella) a).getGalaxia())){
                    catalogo.add(((Estrella) a).getGalaxia());
                }
            }

            if(a instanceof Galaxia){
                if(!galaxias.contains(((Galaxia)a).getNombre()))
                    galaxias.add(((Galaxia)a).getNombre());
                }

            if(a instanceof Planeta){
                if(!galaxias.contains(((Planeta)a).getEstrella().getGalaxia().getNombre()))
                    galaxias.add(((Planeta)a).getEstrella().getGalaxia().getNombre());
                if(!catalogo.contains(((Planeta) a).getEstrella().getGalaxia())) {
                    catalogo.add(((Planeta) a).getEstrella().getGalaxia());
                }
                if(!catalogo.contains(((Planeta) a).getEstrella())) {
                    catalogo.add(((Planeta) a).getEstrella());
                }
            }
            return true;
        }

        */
        return false;

    }

    //Elimina el astro con el nombre indicado
    public void borrar(String nombre){

        for(int i=0; i<catalogo.size(); i++){
            if((catalogo.get(i).getNombre()).equals(nombre)){
                catalogo.remove(i);
                if(catalogo.get(i).visibleCon().equals("a simple vista"))
                    numEstrellasSimpleVista--;
            }


        }
    }

    //Busca un astro por su nombre
    public Astro buscaAstro(String nombre){
        Astro encontrado = null;

        for(int i=0; i<catalogo.size(); i++){
            if((catalogo.get(i).getNombre()).equals(nombre))

                encontrado = catalogo.get(i);
        }

        return encontrado;
    }

    //Devuelve el primer Astro del catálogo que es más brillante en magnitud absoluta que un astro dado
    //(devuelve el primero que cumpla esa condición)
    public Astro primeroMasBrillanteQue(Astro a){

        for(int i=0; i<catalogo.size(); i++){
            if(Math.abs(catalogo.get(i).getBrillo())>Math.abs(a.getBrillo()))
                return catalogo.get(i);
        }

        return null;
    }

    //Devuelve una lista de objetos Astros con las estrellas visibles a simple vista que contiene el catálogo
    public List<Astro> filtraEstrellasSimpleVista(){

        List<Astro> astrosFiltrados = new ArrayList<Astro>();

        for(int i = 0; i<catalogo.size(); i++){
            if(catalogo.get(i).visibleCon().equals("a simple vista")  && catalogo.get(i) instanceof Estrella ||
                    catalogo.get(i) instanceof EstrellaConTipo) {
                astrosFiltrados.add(catalogo.get(i));

            }
        }

        return astrosFiltrados;
    }

    //Devuelve el Astro que es más brillante en magnitud absoluta de todos los catálogos
    public Astro brillaMas(){

        Astro masBrillante = catalogo.get(0);

        for(int i=0; i<catalogo.size(); i++){
            if(Math.abs(catalogo.get(i).getBrillo())>Math.abs(masBrillante.getBrillo()))
                masBrillante=catalogo.get(i);
        }
        return masBrillante;

    }

    @Override
    public String toString() {
        String salida = "";
        for(int i=0; i<catalogo.size(); i++){
            salida += catalogo.get(i).toString() + "\n";
        }
        return salida;
    }
}