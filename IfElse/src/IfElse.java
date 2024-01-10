import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a sua idade >> ");
        int idade = scan.nextInt();
        if (idade < 18) {
            System.out.print("Menor de idade!");
        } else {
            System.out.print("Maior de idade!");
        }
        scan.close();
    }
}