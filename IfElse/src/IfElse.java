import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        boolean sair = false;
        String letra = "Nobody pray for me\n" +
                "It been that day for me\n" +
                "Way\n" +
                "Yeah, yeah!\n" +
                "Ayy, I remember syrup sandwiches and crime allowances\n" +
                "Finesse on 'em with some counterfeits, but now I'm countin' this\n" +
                "Parmesan where my accountant lives, in fact, I'm downin' this\n" +
                "D'USSÉ with my boo bae tastes like Kool-Aid for the analysts\n" +
                "Girl, I can buy yo' ass the world with my paystub\n" +
                "I know that it's good, won't you sit it on my taste bluds?\n" +
                "I get way too petty once you let me do the extras\n" +
                "Pull up on your block, then break it down, we playin' Tetris\n" +
                "A.m. to the p.m., p.m. to the a.m., funk\n" +
                "Eat up your per diem, you just gotta hate 'em, funk\n" +
                "If I quit your BM, I still ride Mercedes, funk\n" +
                "If I quit this season, I still be the greatest, funk\n" +
                "My left stroke just went viral\n" +
                "Right stroke put lil' baby in a spiral\n" +
                "Soprano C, we like to keep it on a high note\n" +
                "It's levels to it, you and I know\n" +
                "Tell 'em, be humble (hol' up)\n" +
                "Sit down (hol' up, hol' up, lil', hol' up)\n" +
                "Be humble (hol' up)\n" +
                "Sit down (hol' up, sit down, lil', sit down, lil')\n" +
                "Be humble (hol' up, hol' up)\n" +
                "Sit down (hol' up, hol' up, lil', hol' up)\n" +
                "Be humble (hol' up)\n" +
                "Sit down (hol' up, hol' up, hol' up)\n" +
                "Be humble (hol' up, hol' up)\n" +
                "Sit down (hol' up, hol' up, lil', hol' up, lil')\n" +
                "Be humble (hol' up)\n" +
                "Sit down (hol' up, sit down, lil', sit down, lil')\n" +
                "Be humble (hol' up, hol' up)\n" +
                "Sit down (hol' up, hol' up, lil', hol' up)\n" +
                "Be humble (hol' up)\n" +
                "Sit down (hol' up, hol' up, hol' up, hol' up)\n" +
                "Who dat -a thinkin' that he frontin' on Man-Man? (Man-Man)\n" +
                "Get the f- off my stage, I'm the Sandman (Sandman)\n" +
                "Get the f- off my (ayy), that ain't right\n" +
                "I make a play blowing up your whole life\n" +
                "I'm so, so sick and tired of the Photoshop\n" +
                "Show me somethin' natural like afro on Richard Pryor\n" +
                "Show me somethin' natural, I wanna feel some stretch marks\n" +
                "Still I take you down right on your mama couch in Polo socks\n" +
                "Ayy, this shit way too crazy, ayy, you do not amaze me, ayy\n" +
                "I blew cool from AC, ayy, Obama just paged me, ayy\n" +
                "I don't fabricate it, ayy, most of y'all be fakin', ayy\n" +
                "I stay modest 'bout it, ayy, she elaborate it, ayy\n" +
                "This that Grey Poupon, that Evian, that TED Talk, ayy\n" +
                "Watch my soul speak, you let the meds talk, ayy\n" +
                "If I kill a, uhm, it won't be the alcohol, ayy\n" +
                "I'm the realest, uhm, after all\n" +
                "Tell 'em, be humble (hol' up)\n" +
                "Sit down (hol' up, hol' up, lil')\n" +
                "Be humble (hol' up)\n" +
                "Sit down (hol' up, sit down, lil', sit down, lil')\n" +
                "Tell 'em sit down (hol' up, hol' up, lil' hol' up)\n" +
                "Be humble (hol' up)\n" +
                "Sit down (hol' up, hol' up, hol' up, hol' up)\n" +
                "Be humble (hol' up, hol' up)\n" +
                "Sit down (hol' up, hol' up, lil' hol' up, lil')\n" +
                "Be humble (hol' up)\n" +
                "Sit down (hol' up, sit down, lil', sit down, lil')\n" +
                "Be humble (hol' up, hol' up)\n" +
                "Sit down (hol' up, hol' up, lil' hol' up)\n" +
                "Be humble (hol' up, hol' up)\n" +
                "Sit down (hol' up, hol' up, hol' up)";

        int posicaoPalavra;
        String palavra;
        String resp;

        while (sair == false) {
            System.out.println(letra);
            System.out.print("\nDigite uma palavra a ser pesquisada na letra acima >> ");
            Scanner scan = new Scanner(System.in);
            palavra = scan.nextLine();
            posicaoPalavra = letra.indexOf(palavra);
            if (posicaoPalavra >= 0) {
                System.out.println("Esta palavra foi encontrada na posição "+posicaoPalavra+" da letra acima.");
            } else {
                System.out.println("Palavra não encontrada!");
            }
            System.out.print("Deseja continuar? (s ou n) > ");
            resp = scan.nextLine();
            if (resp.equals("s")) {
                sair = false;
            } else {
                sair = true;
            }
        }
    }
}