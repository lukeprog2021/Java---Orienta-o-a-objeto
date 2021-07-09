package javacore.introduçãometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public float[] notas;

    public void notaMedia(){
        float aux=0;
        for(int i =0;i<this.notas.length;i++){
            aux+=this.notas[i];
        }
        if( (aux/this.notas.length) >= 6){
            System.out.println("\nEstudante aprovado");
        }else{
            System.out.println("\nEstudante reprovado");
        }
    }

    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }

}
