package laboratorio01.projetoporteiroautomatico;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Porteiro porteiro = new Porteiro();
        Pessoa pessoa = new Pessoa();

        System.out.println("Nome: ");
        pessoa.setNome(input.nextLine());
        System.out.println("Sexo: ");
        pessoa.setSexo(input.nextLine());
        System.out.println("Idade: ");
        pessoa.setIdade(Integer.parseInt(input.nextLine()));

        System.out.println(porteiro.boasVindas(pessoa));
    }
}