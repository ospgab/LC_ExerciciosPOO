public class GerenteProjetos extends Funcionario{


    public GerenteProjetos(String nome, String cpf, double salario, int tempoDeEmpresa) {
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
