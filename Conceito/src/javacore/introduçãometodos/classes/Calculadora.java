package javacore.introduçãometodos.classes;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public void subtrairNumeros(){
        System.out.println(5-5);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros (double num1, double num2){
        if (num1!=0 && num2!=0){return  num1/num2;};
        return 0;
    }
    public void alteraDoisNumeros(int num2, int num1){
        num1=40;
        num2=30;
        System.out.println("Num1: "+num1+"\n"+"Num2: "+num2);
    }
    public void somaArray(int[] numeros){
        int soma=0;
        for (int num:numeros
             ) {
            soma+=num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma=0;
        for (int num:numeros
        ) {
            soma+=num;
        }
        System.out.println(soma);
    }
}
