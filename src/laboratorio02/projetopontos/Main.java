package laboratorio02.projetopontos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Ponto p01 = new Ponto();
        Ponto p02 = new Ponto();

        System.out.println("Primeiro Ponto: ");
        System.out.println("Informe a coordenada X: ");
        p01.setEixoX(input.nextInt());
        System.out.println("Informe a coordenada Y: ");
        p01.setEixoY(input.nextInt());

        System.out.println("O ponto está no " + p01.quadrante());

        System.out.println("Segundo Ponto: ");
        System.out.println("Informe a coordenada X: ");
        p02.setEixoX(input.nextInt());
        System.out.println("Informe a coordenada Y: ");
        p02.setEixoY(input.nextInt());

        System.out.println("O ponto está no " + p02.quadrante());

        boolean iguais = p01.eIgual(p02);

        if (iguais){
            System.out.println("Os dois pontos são iguais");
        }else{
            System.out.println("Os dois pontos são diferentes");
        }

        input.close();
    }
}
