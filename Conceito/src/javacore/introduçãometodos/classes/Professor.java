package javacore.introduçãometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public Integer rg;
    public String cpf;

    public void imprimir(Professor aux){
        System.out.println(aux.cpf);
        System.out.println(aux.matricula);
        System.out.println(aux.rg);
        System.out.println(aux.nome);
        System.out.println("----------------------");
    }

    public void imprimirThis(){
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.nome);
        System.out.println("----------------------");
    }

}

