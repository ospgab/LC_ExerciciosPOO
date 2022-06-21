public class Programador extends Funcionario{


    public Programador(String nome, String cpf, double salario, int tempoDeEmpresa) {
        this.cpf = cpf;
        double auxiliar = (salario + tempoDeEmpresa/4*0.2*salario);
        this.salario = auxiliar;
        this.nome = nome;
        this.tempoDeEmpresa = tempoDeEmpresa;

    }

    private double setSalario(double sal){
        int bonus = tempoDeEmpresa/4;

        if(bonus >= 1){
            double salarioBonus = sal + bonus*0.2*sal;
            return salarioBonus;
        }
        return this.salario;
    }


}
