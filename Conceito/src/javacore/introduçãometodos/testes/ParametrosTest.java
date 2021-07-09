package javacore.introduçãometodos.testes;

import javacore.introduçãometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        int a = 5;
        int b = 10;
        calc.alteraDoisNumeros(a,b); //valor original nunca é alterado
        System.out.println("Num1: "+a+"\n"+"Num2: "+b);

    }
}
