import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannner = new Scanner(System.in);

        /*1 -Crie um programa que realize uma contagem regressiva de 10 até 1,
        mostrando cada número na tela.

        for(int i=10; i >= 1; i--){
            System.out.println("Contagem regressiva... " +i);
        }*/

        /*2 - Escreva um programa que solicite um número ao usuário e exiba a
        tabuada desse número de 1 a 10.*/

        System.out.println("Digite um número: ");
        double number = scannner.nextDouble();

        System.out.println("Tabuada do número " +number);
        for(int i=1; i <=10; i++){
            System.out.println(number + " x " +i + " = " + (number*i));
        }
    }
}