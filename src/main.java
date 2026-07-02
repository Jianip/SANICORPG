import Model.Arqueiro;
import Model.Guerreiro;
import Model.Mago;

public class main {
    public static void main(String[] args) {

        System.out.println("-----------------Mago--------------");
        Mago m1 = new Mago();
        m1.hp();
        m1.mp();
        m1.level();
        m1.exp();
        m1.atq();
        m1.def();
        m1.atacar();
        m1.descansar();


        System.out.println("-----------------Arqueiro--------------");
        Arqueiro a1 = new Arqueiro();
        a1.hp();
        a1.mp();
        a1.level();
        a1.exp();
        a1.atq();
        a1.def();
        a1.atacar();
        a1.descansar();


        System.out.println("-----------------Guerreiro--------------");
        Guerreiro g1 = new Guerreiro();
        g1.hp();
        g1.mp();
        g1.level();
        g1.exp();
        g1.atq();
        g1.def();
        g1.atacar();
        g1.descansar();








    }


}
