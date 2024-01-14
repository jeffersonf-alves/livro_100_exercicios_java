package Exercicios_de_matematica;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu imc é: "+ imc);
        scanner.close();
    }
}
