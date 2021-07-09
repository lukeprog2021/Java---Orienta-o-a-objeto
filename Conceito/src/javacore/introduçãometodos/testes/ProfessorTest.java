package javacore.introduçãometodos.testes;

import javacore.introduçãometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args){
        Professor prof = new Professor();
        prof.cpf = "454654623";
        prof.nome = "Lucas";
        prof.rg = 121365;
        prof.matricula = "kjhkg15";

        Professor prof2 = new Professor();
        prof2.cpf = "561654";
        prof2.nome = "João";
        prof2.rg = 4648213;
        prof2.matricula = "548786";

        //Passagem de parametros com referencia de endereço
        prof.imprimir(prof);
        prof.imprimir(prof2);

        //This pega os valores do próprio objeto
        prof.imprimirThis();
        prof2.imprimirThis();
    }
}
