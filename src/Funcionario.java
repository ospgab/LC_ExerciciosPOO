public abstract class Funcionario implements funcis{

        String nome;
        String cpf;
        double salario;
        int tempoDeEmpresa;





        public String getNome(){
                return this.nome;
        }

        public String getCpf(){
                return this.cpf;
        }

        @Override
        public String toString() {
                return "Funcionario{" +
                        "nome='" + nome + '\'' +
                        ", cpf='" + cpf + '\'' +
                        ", salario=" + salario +
                        '}';
        }
}
