package Model;

import Interface.Ataque;

public class Arqueiro extends Personagem implements Ataque {


    public void hp() {
        System.out.println("vida: 80");
    }


    public void mp() {
        System.out.println("mana: 110");

    }


    public void level() {
        System.out.println("level: 26");
    }


    public void exp() {
        System.out.println("pontos: 80");
    }


    public void atq() {
        System.out.println("ataque: 140");
    }


    public void def() {
        System.out.println("defesa :96");
    }


    @Override
    public void sk1() {
        System.out.println("arcada");

    }

    @Override
    public void sk2() {
        System.out.println("flexada");

    }

    @Override
    public void ult() {
        System.out.println("chuva de flechas");

    }
}
