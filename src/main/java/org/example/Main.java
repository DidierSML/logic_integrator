package org.example;

import org.example.pokemon.Bulbasor;
import org.example.pokemon.Charmander;
import org.example.pokemon.Pikachu;
import org.example.pokemon.Squirtle;

public class Main {
    public static void main(String[] args) {

        Bulbasor bulbasor = new Bulbasor();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();

        bulbasor.atacarAraniazo();
        bulbasor.atacarPlacaje();
        bulbasor.atacarDrenaje();

        charmander.atacarMordisco();
        charmander.atacarLanzaLlamas();

        pikachu.atacarMordisco();
        pikachu.atacarImpactTrueno();

        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();

    }
}

/**
 * Clase Ejecutable: Aquí probaremos y crearemos los respectivos Objetos tipo
 * Pokemon, los cuales usaran los ataques de la Clase abstracta y asi mismo
 * algunos ataques propios de la interfaz que cada uno implemento
 */