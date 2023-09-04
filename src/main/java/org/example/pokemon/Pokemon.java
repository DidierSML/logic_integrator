package org.example.pokemon;

public abstract class Pokemon {

    //Atributos para el uso de todas sus Clases hijas
    protected int numPokedex;
    protected String nombre;
    protected int peso;
    protected String sexo;
    protected int temporada;

    //Metodos abstractos que podran usar todas sus Clases hijas
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

}

/**
 * Clase Abstracta (Pokemon), que servirá de plantilla para otras Clases que al extender de
 * esta podrán usar sus atributos y métodos.
 * Clases que extenderán de (Pokemon) : (Bulbasor, Charmander, Pikachu, Squirtle)
 */