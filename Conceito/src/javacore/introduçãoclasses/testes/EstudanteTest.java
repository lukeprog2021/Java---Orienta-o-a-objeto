package javacore.introduçãoclasses.testes;

import javacore.introduçãoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        Estudante lucas = new Estudante();
        lucas.nome = "lucas";
        lucas.idade = 22;
        lucas.matricula = "1212";

        System.out.println(lucas.nome);
        System.out.println(lucas.idade);
        System.out.println(lucas.matricula);
    }
}
