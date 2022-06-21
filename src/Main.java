import java.util.Scanner;

class calculaSalario{
    double getSalario(Funcionario[] quadro, String cpf){
        for(Funcionario funci : quadro){
            if(funci.cpf.equals(cpf)){
                return funci.getSalario();
            }
        }
        return Double.parseDouble(null);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario[] quadroFuncionarios = new Funcionario[6];

        quadroFuncionarios[0] = new Coordenador("Barbara", "111222333", 3500, 15);
        quadroFuncionarios[1] = new GerenteProjetos("Cassio", "123123123", 3700, 5);
        quadroFuncionarios[2] = new GerenteProjetos("Manuela", "333222111", 3700, 10);
        quadroFuncionarios[3] = new Programador("Reinaldo", "123321123", 2500, 2);
        quadroFuncionarios[4] = new Programador("Juliana", "321123321", 2500, 6);
        quadroFuncionarios[5] = new Programador("Marcos", "112233123", 2500, 25);

       for(Funcionario funci : quadroFuncionarios){
           System.out.println(funci.toString());
       }


        calculaSalario c = new calculaSalario();

        System.out.print("Digite o CPF para buscar: ");
        String entrada = sc.nextLine();
        System.out.println(c.getSalario(quadroFuncionarios, entrada));



    }
}