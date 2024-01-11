package Exercicios_de_matematica;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int n1, n2 = 0;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite um número: N1");
        n1 = tc.nextInt();

        System.out.println("Digite um número: N2");
        n2 = tc.nextInt();

        System.out.println(n1+ " + "+n2 +" = "+ (n1 + n2));
        System.out.println(n1+ " - "+n2 +" = "+ (n1 - n2));
        System.out.println(n1+ " * "+n2 +" = "+ (n1 * n2));
        System.out.println(n1+ " / "+n2 +" = "+ (n1 / n2));

        tc.close();
    }

}
