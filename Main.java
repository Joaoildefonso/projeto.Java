import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        int servico = 2;

        switch (servico){
            case 1:
                System.out.println("Cadastrar ");
                

                break;
            case 2:
                System.out.println("Efetuar login");
                break;
            case 3:
                System.out.println("Escolher serviço");
                break;

            default:
                System.out.println("Opção inválida!");
                break;




        }
    }
}
