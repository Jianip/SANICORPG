package Model;

import Interface.Ataque;

public class Guerreiro extends Personagem implements Ataque {


    public void hp() {
        System.out.println("vida: 220");
    }


    public void mp() {
        System.out.println("mana: 150");

    }


    public void level() {
        System.out.println("level: 30");
    }


    public void exp() {
        System.out.println("pontos: 140");
    }


    public void atq() {
        System.out.println("ataque: 380");
    }


    public void def() {
        System.out.println("defesa: 400");
    }

    @Override
    public void sk1() {
        System.out.println("soco");

    }

    @Override
    public void sk2() {
        System.out.println("escudada");

    }

    @Override
    public void ult() {
        System.out.println("espadada");

    }
}
