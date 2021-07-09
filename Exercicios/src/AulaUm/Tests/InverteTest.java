package AulaUm.Tests;

import AulaUm.Classes.VetorInventer;

public class InverteTest {
    public static void main(String[] args) {
        VetorInventer vetor = new VetorInventer();
        vetor.tamanho = 10;
        vetor.imprimir(vetor.inverter(vetor.valores(10,9,8,7,6,5,4,3,2,1)));
    }
}