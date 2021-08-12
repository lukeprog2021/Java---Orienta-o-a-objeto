package modificadores.test;


import modificadores.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args){
        Cliente c = new Cliente();
        System.out.println("Número de parcelas:");
        /*for(int parcela : c.getParcelas()){
            System.out.println(parcela+" ");
        }*/
        System.out.println("Tamanho: "+Cliente.getParcelas().length);
    }
}
