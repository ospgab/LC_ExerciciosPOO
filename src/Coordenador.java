public class Coordenador extends Funcionario{


    public Coordenador(String nome, String cpf, double salario, int tempoDeEmpresa) {
        this.cpf = cpf;
        this.salario = salario;
        this.nome = nome;
        this.tempoDeEmpresa = tempoDeEmpresa;
    }


    @Override
    public double getSalario() {
        return this.salario;
    }
}
