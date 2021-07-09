package javacore.introduçãometodos.testes;

import javacore.introduçãometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        float[] notas = {8f,5f,5f};
        Estudante estudante = new Estudante();
        estudante.nome = "Lucas";
        estudante.idade = 22;
        estudante.notas = notas;
        estudante.exibirDados();
        estudante.notaMedia();
    }
}
