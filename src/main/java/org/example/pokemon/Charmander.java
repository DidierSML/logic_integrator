package org.example.pokemon;

import org.example.elemental_power.IFuego;

public class Charmander extends Pokemon implements IFuego {

    //Se inicializa el Objeto (Bulbasor) con un Constructor Vacio
    public Charmander() {
    }

    //Metodos de la Clase Abstracta o Padre (Pokemon)
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque Arianazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque Mordisco");
    }

    //Metodos de la ((I) Fuego)
    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Especial de Fuego Punio Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y este es mi ataque Especial de Fuego Lanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque Especial de Fuego Ascuas");
    }
}

/**
 * La Clase Charmander extenderá de Su Clase Padre (Pokemon), en consecuencia podra usar
 * los métodos de esta a su manera; así mismo, la Clase implementará la (I) (I Fuego) por lo que
 * deberá usar todos sus métodos personalizandolos como considere.
 */
