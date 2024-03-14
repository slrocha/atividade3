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
        tabuada desse número de 1 a 10.

        System.out.println("Digite um número: ");
        double number = scannner.nextDouble(); //considerando qualquer número, inclusive número reais.

        System.out.println("Tabuada do número " +number);
        for(int i=1; i <=10; i++){
            System.out.println(number + " x " +i + " = " + (number*i));
        }*/

        /*3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.

        int par = 0;
        for(int i = 1; i <=100; i++){
            if(i%2 == 0){
                par = par+i;
            }
        }
        System.out.println("A soma dos números pares de 1 à 100 equivale à " +par);*/

        /*4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.

        System.out.println("Digite um número: ");
        int number = scannner.nextInt();

        if(number%2 !=0 || number == 2){ //o número 2 é o unico numero par primo.
            System.out.println("O número "+ number + " é primo");
        } else {
            System.out.println("O número "+ number + " não é primo");
        }*/
    }
}