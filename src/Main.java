import java.util.ArrayList;
import java.util.Scanner;

class calculaSalario{
    void getSalario(ArrayList<Funcionario> quadro, String cpf){
        for(Funcionario funci : quadro){
            if(funci.cpf.equals(cpf)){
                System.out.println(funci.getNome() + " " + funci.getSalario());
            }
        }
    }

    void getTotal(ArrayList<Funcionario> quadro){
        double totalSalario = 0;
        for(Funcionario funci : quadro){
            totalSalario += funci.getSalario();
        }
        System.out.println("O valor total dos salários é: " + totalSalario);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> quadroFunci = new ArrayList<>();

        quadroFunci.add(new Coordenador("Barbara", "111222333", 3500, 15));
        quadroFunci.add(new GerenteProjetos("Cassio", "123123123", 3700, 5));
        quadroFunci.add(new GerenteProjetos("Manuela", "333222111", 3700, 10));
        quadroFunci.add(new Programador("Reinaldo", "123321123", 2500, 2));
        quadroFunci.add(new Programador("Juliana", "321123321", 2500, 6));
        quadroFunci.add(new Programador("Marcos", "112233123", 2500, 12));


       for(Funcionario funci : quadroFunci){
           System.out.println(funci.getNome() + " " + funci.getSalario());
       }

        calculaSalario c = new calculaSalario();

       c.getTotal(quadroFunci);

       do {
           System.out.print("Digite o CPF para buscar ou esc para sair: ");
           String entrada = sc.nextLine();
           if(entrada.equals((String) "esc") || entrada.equals((String) "ESC")){
               break;
           }
           c.getSalario(quadroFunci, entrada);
       }while(true);




    }
}