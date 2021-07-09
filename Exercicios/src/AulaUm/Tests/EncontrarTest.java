package AulaUm.Tests;

import AulaUm.Classes.EntDados;
import AulaUm.Classes.Strings;

public class EncontrarTest {

    public static void main(String[] args){
        EntDados dados = new EntDados();
        Strings user = new Strings();

        user.frase = dados.frase();
        user.letra = dados.letra();

        int result = user.analise();
        System.out.println("Letra " + user.letra+ " encontrada "+result+" vezes");
    }
}
