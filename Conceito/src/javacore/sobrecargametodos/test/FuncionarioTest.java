package javacore.sobrecargametodos.test;

import javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.init("Lucas","475763615881",2500,"14525668");
        funcionario.exibir();
    }
}
