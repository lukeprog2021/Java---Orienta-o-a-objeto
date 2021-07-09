package AulaUm.Classes;

public class VetorInventer {
    public int tamanho;
    public int[] valores(int... numeros){
        return numeros;
    };

    public int[] inverter(int[] vetor) {
        int[] aux = new int[this.tamanho];
        for (int val: vetor ) {
            this.tamanho--;
            aux[this.tamanho] = val;
        } return aux;
    }
    public void imprimir (int[] args){
        for(int i =0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}
