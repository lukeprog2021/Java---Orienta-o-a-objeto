package herança.classes;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Bloco de inicializaçaõ 1 funcionario");
    }
    {
        System.out.println("Bloco de inicialização 2 funcionario");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("construtor Funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: "+this.salario);
        imprimeRecibo();
    }

    public void imprimeRecibo(){
        System.out.println("Eu("+super.nome+") recebi o pagamento de"+ this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
