package javacore.introduçãometodos.testes;

import javacore.introduçãometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calc;
        calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtrairNumeros();
        calc.multiplicaDoisNumeros(5,6);
        System.out.println(calc.divideDoisNumeros(10d,5d));

        int[] numeros = new int[]{1,2,3,4,5};
        calc.somaArray(numeros);

        //transforma em um array os parametros. Aceita tanto array como numeros
        calc.somaVarArgs(1,2,3,4,5,6,7);
    }
}
