package AulaUm.Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {

    public String frase;
    public char letra;

    public int analise(){
        int count = 0;
        for(int i=0;i<this.frase.length();i++){
            if (this.frase.charAt(i) == this.letra) {
                count += 1;
            }
        }
        return count;
    }
}
