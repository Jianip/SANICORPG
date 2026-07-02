package Model;

import Interface.Ataque;

public class Arqueiro extends Personagem implements Ataque {

    @Override
    public void hp() {
        System.out.println("vida: 80");
    }

    @Override
    public void mp() {
        System.out.println("mana: 110");

    }

    @Override
    public void level() {
        System.out.println("level: 26");
    }

    @Override
    public void exp() {
        System.out.println("pontos: 80");
    }

    @Override
    public void atq() {
        System.out.println("ataque: 140");
    }

    @Override
    public void def() {
        System.out.println("defesa :96");
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
