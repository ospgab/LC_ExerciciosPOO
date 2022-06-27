public class Programador extends Funcionario{


    public Programador(String nome, String cpf, double salario, int tempoDeEmpresa) {
        this.cpf = cpf;
        double auxiliar = (salario + tempoDeEmpresa/4*0.2*salario);
        this.salario = auxiliar;
        this.nome = nome;
        this.tempoDeEmpresa = tempoDeEmpresa;

    }



    @Override
    public double getSalario() {
        int bonus = tempoDeEmpresa/4;

        if(bonus >= 1){
            double salarioBonus = this.salario + bonus * 0.2 * this.salario;
            return salarioBonus;
        }
        return this.salario;
    }
}
