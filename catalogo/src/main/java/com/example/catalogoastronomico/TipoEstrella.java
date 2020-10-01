package com.example.catalogoastronomico;

/**
 *
 * @author Lorena-Ioana Florescu X7261992H(IOT)
 * @version 29/09/(2020)
 *
 */

public enum TipoEstrella {
    ENANA_AMARILLA("Enana Amarilla", "https://es.wikipedia.org/wiki/Estrella_de_tipo-G_de_la_secuencia_principal"),
    ENANA_BLANCA("Enana Blanca", "https://es.wikipedia.org/wiki/Enana_blanca"),
    GIGANTE_ROJA("Gigante Roja", "https://es.wikipedia.org/wiki/Gigante_roja"),
    SUBGIGANTE_BLANCA("Subgigante Blanco", "https://es.wikipedia.org/wiki/Subgigante");

    private final String nombre;
    private final String url;

    TipoEstrella(String nombre, String url){
        this.nombre=nombre;
        this.url=url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }
}
