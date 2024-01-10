import java.util.Scanner;

public class IfElse21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final String login = "eusouofelps", senha = "felpseu";
        String login1 = "", senha1 = "";
        boolean log = false;

        System.out.println("Bem vindo(a) ao nosso banco!");

        while (log == false) {
            System.out.print("Digite o seu e-mail: ");
            login1 = scan.nextLine();
            System.out.print("Digite a senha: ");
            senha1 = scan.nextLine();

            if (senha1.equals(senha) && login1.equals(login)) {
                System.out.println("Acesso permitido!");
                log = true;
            } else {
                System.out.println("Acesso negado! Tente novamente.");
            }
        }
        System.out.println("Obrigado por escolher o nosso banco!");
        scan.close();
    }
}