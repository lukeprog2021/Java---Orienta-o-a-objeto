package AulaUm.Classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EntDados {

    public String frase() {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String s = "";
        System.out.println("Entre com a frase: ");
        try {
            s = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        return s.toLowerCase();
    }

    public char letra() {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String t = "";
        System.out.println("Buscar a letra: ");
        try {
            t = cd.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        String x = t.toLowerCase();
        char l = x.charAt(0);
        return l;
    }


}
