package Exercicios_de_matematica;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3 = 0;

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        n3 = scanner.nextDouble();

        scanner.close();

        double mediaGeometrica = Math.pow(n1 * n2 * n3, 1.0/ 3.0);

        System.out.println("A média geométrica é: "+ mediaGeometrica);
    }
}
