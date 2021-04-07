package radarsimples;

import java.util.Scanner;

public class radar {

    public static void main(String[] args) {

        double n1, km1, km2, km3, km4;
        double multa;
        int op;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a velocidade do seu carro agora?");
        n1 = entrada.nextDouble();

        if (n1 > 80) {
            System.out.println("Multado! Você excedeu o limite permitido que é de 80Km/h");
           multa = (n1 - 80) * 8.50;
        
        
  
            
        System.out.println("Qual km da rodovia você foi multado?");
        System.out.println("#####SELECIONA UMA OPERAÇÃO##### ");
        System.out.println("[1] - KM 1 - 80");
        System.out.println("[2] - KM 81 -105 ");
        System.out.println("[3] - KM 105 - 210 ");
        System.out.println("[4] - KM 211 - 255");
        System.out.println(">>>>>>>digite aqui sua opção<<<<<<");
        op = entrada.nextInt();
 
        switch (op){ 
            case 1:
                km1 = multa * 1.10;
                System.out.println("Valor da multa por andar nesse km é de: " + km1);
                System.out.println("Tenha um bom dia! Dirija com segurança!");
                break;

            case 2:
                km2 = multa * 1.20;
                System.out.println("Valor da multa por andar nesse km é de: " + km2);
                System.out.println("Tenha um bom dia! Dirija com segurança!");
                break;

            case 3:
                km3 = multa * 1.38;
                System.out.println(" Valor da multa por andar nesse km é de: " + km3);
                System.out.println("Tenha um bom dia! Dirija com segurança!");
                break;

            case 4:
                km4 = multa * 1.02;
                System.out.println("Valor da multa por andar nesse km é de: " + km4);
                System.out.println("Tenha um bom dia! Dirija com segurança!");
                break;
        }        
        }
        }