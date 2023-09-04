package org.example.pokemon;

import org.example.elemental_power.IAgua;

public class Squirtle extends Pokemon implements IAgua {

    //Se inicializa el Objeto (Squirtle) con un Constructor Vacio
    public Squirtle() {
    }

    //Metodos de la Clase Abstracta o Padre (Pokemon)
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Squirtle  y este es mi ataque Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Squirtle  y este es mi ataque Arianiazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Squirtle  y este es mi ataque Mordisco");
    }

    //Metodos de la ((I) Agua)
    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy Squirtle  y este es mi Super ataque de Agua Hidrobomba");
    }

    @Override
    public void atracarBurbuja() {
        System.out.println("Hola soy Squirtle  y este es mi Super ataque de agua Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle  y este es mi Super ataque de agua Pistola de Agua");
    }
}

/**
 * La Clase Squirtle extenderá de Su Clase Padre (Pokemon), en consecuencia podra usar
 * los métodos de esta a su manera; así mismo, la Clase implementará la (I) (I Agua) por lo que
 * deberá usar todos sus métodos personalizandolos como considere.
 */