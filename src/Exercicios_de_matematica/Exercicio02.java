package Exercicios_de_matematica;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        double n1, n2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.println("A média dos dois números é: "+ ((n1 + n2) / 2 ));


    }
}
