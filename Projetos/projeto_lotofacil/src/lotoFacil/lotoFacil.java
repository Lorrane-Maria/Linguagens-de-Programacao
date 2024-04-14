package lotoFacil;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class lotoFacil {
    public static void main(String[] args) throws IOException {
        int opcao = -1;
        int n1 = -1;
        Scanner teclado = new Scanner(System.in);
        Random ran = new Random();

        do{
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            opcao = teclado.nextInt();

            if (opcao >= 0 && opcao <= 3){
                switch (opcao){
                    case 1:
                        System.out.println("Escolha um número de 0 a 100: ");
                        n1 = teclado.nextInt();
                        int n2 = ran.nextInt(101);
                        if (n1 < 0 || n1 >100){
                            System.out.println("Aposta invalida.");
                        } else if (n1 == n2) {
                            System.out.println("Você ganhou R$ 1.000,00 reais.");
                        }else {
                            System.out.println("Que pena! O número sorteado foi: " + n2);
                        }
                        break;
                    case 2:
                        char c;
                        char letraPremiada = 'L';

                        System.out.print("Escolha uma letra de A à Z: ");
                        try {
                            c = (char) System.in.read();
                            c = Character.toUpperCase(c);
                            if (!Character.isLetter(c)){
                                System.out.println("Aposta inválida.");
                            }else{
                                if (c != letraPremiada){
                                    System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
                                }else{
                                    System.out.println("Você ganhou R$ 500,00 reais.");
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 3:
                        System.out.print("Digite um número: ");
                        int n3 = teclado.nextInt();
                        if (n3 % 2 == 0){
                            System.out.println("Você ganhou R$ 100,00 reais.");
                        }else{
                            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                        }
                }
            }else{
                System.out.println("Opção selecionada é inválida!");
            }
        }while(opcao != 0);
    }
}