package javacore.introduçãoclasses.testes;

import javacore.introduçãoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args){
        Professor professor = new Professor();
        professor.cpf = "47576315881";
        professor.rg = 54937832;
        professor.matricula = "1a2b3cegh5";
        professor.nome = "Lucas Souza SIlva";
        System.out.println("Nome: "+professor.nome+ "\n"+"RG: "+professor.rg+ "\n"+"Matricula: "+professor.matricula+"\n"+"CPF: "+ professor.cpf);
    }
}
