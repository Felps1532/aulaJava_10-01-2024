public class ForEach {
    public static void main(String[] args) {
        String[] frutas = {"maçã", "pera", "melancia", "banana", "caqui", "morango"};

        System.out.println("Você possui "+frutas.length+" frutas em estoque.");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta ["+(i+1)+"] - "+frutas[i]);
        }
    }
}