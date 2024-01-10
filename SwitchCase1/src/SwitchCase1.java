import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] opcoes = {"Criar", "Ler", "Editar", "Excluir"};

        for (int i = 0; i < opcoes.length; i++) {
            System.out.println("Opção ["+i+"] -  "+opcoes[i]);
        }
        System.out.print("Escolha uma das opções acima: ");
        int resp = scan.nextInt();

        switch (resp) {
            case 0:
                System.out.println("Você escolheu "+opcoes[0] +"!");
                break;
            case 1:
                System.out.println("Você escolheu "+opcoes[1] +"!");
                break;
            case 2:
                System.out.println("Você escolheu "+opcoes[2] +"!");
                break;
            case 3:
                System.out.println("Você escolheu "+opcoes[3] +"!");
                break;
        }
        scan.close();
    }
}