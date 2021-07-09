package javacore.introduçãoclasses.testes;

import javacore.introduçãoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.modelo = "Gol";
        carro.placa = "1a2bc3";
        carro.velocidade = (float) 60.8;
        System.out.println(carro.modelo);
    }
}
