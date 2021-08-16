package herança.test;

import herança.classes.Endereço;
import herança.classes.Funcionario;
import herança.classes.Pessoa;

public class HerançaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("jkghkk");
        Endereço end = new Endereço();
        p.setNome("Gina");
        p.setCpf("123456789");
        end.setBairro("Limoeiro");
        end.setRua("Rua das flores");
        p.setEndereço(end);
        p.imprime();

        Funcionario f = new Funcionario(" beto");
        f.setNome("Lucas");
        f.setCpf("44446546546");
        f.imprime();
    }
}
