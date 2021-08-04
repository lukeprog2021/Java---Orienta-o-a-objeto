package modificadores.test;

import modificadores.classes.Carro;

public class CarroTest {
    public static void main(String[] args){
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Audi",275);
        Carro c3 = new Carro("Mercedes",290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println(" ");
        System.out.println("####### Alterado a seguir #######");
        Carro.setVelocidadeLimite(200);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
