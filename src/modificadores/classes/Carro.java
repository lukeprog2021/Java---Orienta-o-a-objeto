package modificadores.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro() {
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public  static double getVelocidadeLimite(){
        return velocidadeLimite;
    }


    public void imprime(){
        System.out.println("-----------------------------------");
        System.out.println("Modelo: "+this.nome);
        System.out.println("Velocidade Máxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade Limite: "+velocidadeLimite);
    }
}
