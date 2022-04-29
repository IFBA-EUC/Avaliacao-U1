package Desafio1.Q1;

//Scanner.java está dentro da seguinte pasta java/util/
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        double n1, n2, media;
        int x = 1;
        while(x==1) {
            Scanner leitor = new Scanner(System.in);
            do {
                System.out.println("Digite nota 1");
                n1 = leitor.nextDouble();
            } while (n1 < 0 || n1 > 10);
            do {
                System.out.println("Digite nota 2");
                n2 = leitor.nextDouble();
            } while (n2 < 0 || n2 > 10);

            //Cálculo da média
            media = (n1 + n2) / 2;
            System.out.println("A média é " + media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                x = leitor.nextInt();
            } while(x != 1 && x != 2);
        }
    }
}
