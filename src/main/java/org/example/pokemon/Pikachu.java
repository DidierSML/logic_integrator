package org.example.pokemon;

import org.example.elemental_power.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {

    //Se inicializa el Objeto (Pikachu) con un Constructor Vacio
    public Pikachu() {
    }

    //Metodos de la Clase Abstracta o Padre (Pokemon)
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");
    }

    //Metodos de la ((I) Electrico)
    @Override
    public void atacarImpactTrueno() {
        System.out.println("Hola soy Pikachu y este es mi Super ataque de Trueno Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi super ataque de Trueno Punio Trueno");
    }
}

/**
 * La Clase Pikachu extenderá de Su Clase Padre (Pokemon), en consecuencia podra usar
 * los métodos de esta a su manera; así mismo, la Clase implementará la (I) (I Eléctrico) por lo que
 * deberá usar todos sus métodos personalizandolos como considere.
 */
