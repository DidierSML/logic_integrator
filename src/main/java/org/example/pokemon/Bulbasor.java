package org.example.pokemon;

import org.example.elemental_power.IPlanta;

public class Bulbasor extends Pokemon implements IPlanta {

    //Se inicializa el Objeto (Bulbasor) con un Constructor Vacio
    public Bulbasor(){

    }

    //Metodos de la Clase Abstracta o Padre (Pokemon)
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Bulbasor y este es mi ataque Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Bulbasor y este es mi ataque Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Bulbasor y este es mi ataque Mordisco");
    }

    //Metodos de la ((I) Planta)
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasor y este es mi ataque Especial de Planta Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasor y este es mi ataque Especial de Planta Paralizar");
    }
}

/**
 * La Clase Bulbasor extenderá de Su Clase Padre (Pokemon), en consecuencia podra usar
 * los métodos de esta a su manera; así mismo, la Clase implementará la (I) (I Planta) por lo que
 * deberá usar todos sus métodos personalizandolos como considere.
 */