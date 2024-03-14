import java.util.ArrayList;
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

        /*5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.

        int k = 20;
        int[] fib_sequencia_inicial = new int[k];
        fib_sequencia_inicial[0] = 1;
        fib_sequencia_inicial[1] = 1;

        for (int i = 2; i < k; i++) {
            fib_sequencia_inicial[i] = fib_sequencia_inicial[i - 1] + fib_sequencia_inicial[i - 2];
        }

        System.out.println("Os primeiros " + k + " números da sequência de Fibonacci são: \n ");
        for (int i = 0; i < k; i++) {
            System.out.print(fib_sequencia_inicial[i] + " ");
        }*/

        /*6 - Faça um programa que solicite ao usuário números inteiros positivos. Quando o usuário digitar
        um número negativo, o programa deve exibir a média dos números inseridos até aquele momento.

        int cont= 0;
        int i = 0;
        int number;

        System.out.println("Digite um número inteiro POSITIVO:");
        number = scannner.nextInt();

        while( number > 0) {
            cont = cont + number;
            System.out.println("Digite um número inteiro POSITIVO:");
            number = scannner.nextInt();
            i++;
        }

        System.out.println("A soma dos números inseridos é: " + (cont));
        System.out.println("A média dos números inseridos é: " + (cont/i));*/

        /*7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração,
        multiplicação e divisão entre dois números, utilizando um laço de repetição para continuar operando
        até que o usuário decida sair.

        System.out.println("Digite o PRIMEIRO número");
        double a  = scannner.nextDouble();

        System.out.println("Digite o SEGUNDO número");
        double b  = scannner.nextDouble();

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Adição ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");
        System.out.println("5 - Sair ");
        int option = scannner.nextInt();

        while(option != 5 ){
            switch (option){
                case 1:
                    System.out.println(a + " + " + b + " = " + (a+b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (a-b));
                    break;
                case 3:
                    System.out.println(a + " x " + b + " = " + (a*b));
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + (a/b));
                    break;
                default:
                    System.out.println("Opção inválida, digite um número que consta no MENU.");
                    break;
            }

            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adição ");
            System.out.println("2 - Subtração ");
            System.out.println("3 - Multiplicação ");
            System.out.println("4 - Divisão ");
            System.out.println("5 - Sair ");
            option = scannner.nextInt();
        }*/

        /*8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o
        jogador deve tentar adivinhá-lo. O programa deve fornecer dicas do tipo "maior" ou "menor"
        conforme necessário.

        Random random = new Random();

        int palpite = 0, numerodasorte = random.nextInt(10) + 1;

        System.out.println(" Vamos iniciar o jogo");
        System.out.println(" Voce deve acertar o numero que o robo esta pensando");

        while(palpite != numerodasorte){
            System.out.println("Digite um numero, vamos ver se voce acerta");
            palpite = scannner.nextInt();
            if(palpite == numerodasorte){
                System.out.println("Parabenssssss voce acertou");
                break;
            }else{
                if(palpite > numerodasorte){
                    System.out.println("Tente um número menor");
                } else{
                    System.out.println("Tente um número maior");
                }
            }
        } */

        /*9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa,
        solicitando ao usuário qual conversão deseja fazer. O programa deve continuar executando até que o
        usuário decida sair.

        System.out.println("Digite o valor da temperatura: ");
        double temp = scannner.nextDouble();

        System.out.println("Escolha a opção para qual deseja converter a tempertaruta");
        System.out.println("1 - Celsius     ->  Fahrenheit");
        System.out.println("2 - Fahrenheit  ->  Celsius");
        System.out.println("3 - Sair ");
        int option = scannner.nextInt();

        while(option != 3){
            switch (option){
                case 1:
                    temp = (temp*1.8)+32;
                    System.out.println("Celsius -> Fahrenheit = " +temp );
                    break;
                case 2:
                    temp = (temp-32)/1.8;
                    System.out.println("Fahrenheit -> Celsius = " +temp );
                    break;
                default:
                    System.out.println("Opção inválida, digite um número que consta no MENU.");
                    break;
            }
            System.out.println("Escolha a opção para qual deseja converter a tempertaruta");
            System.out.println("1 - Celsius     ->  Fahrenheit");
            System.out.println("2 - Fahrenheit  ->  Celsius");
            System.out.println("3 - Sair ");
            option = scannner.nextInt();
        }*/

        /*10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras.
        O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário
        deseja adicionar mais itens. O programa deve continuar executando até que o usuário decida sair.*/

        String item;
        ArrayList<String> itens = new ArrayList<String>();

        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Adicionar compras no carrinho");
        System.out.println("2 - Consultar carrinho");
        System.out.println("3 - Sair");
        int option = scannner.nextInt();

        while(option != 3){
            switch (option){
                case 1:
                    System.out.println("Digite o nome do item: ");
                    item = scannner.next();
                    itens.add(item);
                    break;
                case 2:
                    System.out.println("Lista atualizada: " +itens);
                    break;
                default:
                    System.out.println("Opção inválida, digite um número que consta no MENU.");
                    break;
            }

            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Adicionar compras no carrinho");
            System.out.println("2 - Consultar carrinho");
            System.out.println("3 - Sair");
            option = scannner.nextInt();

        }
    }
}