// Escreva um programa que leia o peso e altura do usuario e imprima seu IMC.

import java.util.Scanner;

public class calculeIMC {
    private double peso;
    private double altura;

    public calculeIMC(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public double calcular(){
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void main(String[] args) {
        System.out.println("Digite o seu peso: ");
        Scanner s = new Scanner(System.in);
        double peso = s.nextDouble();
        
        System.out.println("Digite a sua altura: ");
        double altura = s.nextDouble();
        s.close();
        
        calculeIMC user1 = new calculeIMC(peso, altura);
        System.out.printf("Seu IMC é: %.1f", user1.calcular());
    }
}
