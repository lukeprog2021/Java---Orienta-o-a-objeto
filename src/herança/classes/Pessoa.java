package herança.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereço endereço;

    public Pessoa(String nome){
        System.out.println("construtor pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("cpf: "+this.cpf);
        System.out.println("rua: "+this.endereço.getRua());

    }


    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
