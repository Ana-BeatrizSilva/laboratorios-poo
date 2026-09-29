package laboratorio01.projetodoacaodesangue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        AtendenteDaEnfermaria atendente01 = new AtendenteDaEnfermaria();

        int contDoadores = 0;

        for(int i = 1; i <= 2; i++){

            System.out.println("Nome: ");
            String nome = input.nextLine();

            System.out.println("Sexo: ");
            String sexo = input.nextLine();

            System.out.println("Peso: ");
            float peso = Float.parseFloat(input.nextLine());

            System.out.println("Altura: ");
            int altura = Integer.parseInt(input.nextLine());

            System.out.println("Idade: ");
            int idade = Integer.parseInt(input.nextLine());

            System.out.print("Fez tatuagem no último ano? (true/false): ");
            boolean tatuagem = Boolean.parseBoolean(input.nextLine());

            System.out.print("Ingeriu álcool nas últimas 12 horas? (true/false): ");
            boolean alcool = Boolean.parseBoolean(input.nextLine());

            Pessoa pessoa = new Pessoa(nome, sexo, peso, altura, idade);

            boolean podeDoar = atendente01.avaliarDoador(pessoa, tatuagem, alcool);
            if (podeDoar) {
                System.out.println(pessoa.getNome() + " pode doar sangue");
                contDoadores++;
            } else {
                System.out.println(pessoa.getNome() + " não pode doar sangue");
            }
        }

        System.out.println("Quantidade de pessoas que puderam doar sangue: " + contDoadores);

        input.close();
    }
}