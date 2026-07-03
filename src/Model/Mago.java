package Model;

import Interface.Ataque;

public class Mago extends Personagem implements Ataque {


    public void hp() {
        System.out.println("vida: 100");
    }


    public void mp() {
        System.out.println("mana: 150");

    }


    public void level() {
        System.out.println("level: 20");
    }


    public void exp() {
        System.out.println("pontos: 100");
    }


    public void atq() {
        System.out.println("ataque: 220");
    }


    public void def() {
        System.out.println("defesa: 150");
    }

    @Override
    public void sk1() {
        System.out.println("cajadada");

    }

    @Override
    public void sk2() {
        System.out.println("magia de fogo");

    }

    @Override
    public void ult() {
        System.out.println("magia de raio");

    }
}
