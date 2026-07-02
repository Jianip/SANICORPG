package Model;

import Interface.Ataque;

public class Mago extends Personagem implements Ataque {

    @Override
    public void hp() {
        System.out.println("vida: 100");
    }

    @Override
    public void mp() {
        System.out.println("mana: 150");

    }

    @Override
    public void level() {
        System.out.println("level: 20");
    }

    @Override
    public void exp() {
        System.out.println("pontos: 100");
    }

    @Override
    public void atq() {
        System.out.println("ataque: 220");
    }

    @Override
    public void def() {
        System.out.println("defesa: 150");
    }

    @Override
    public void sk1() {

    }

    @Override
    public void sk2() {

    }

    @Override
    public void ult() {

    }
}
