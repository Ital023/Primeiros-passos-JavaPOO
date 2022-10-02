/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/

package Questao2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double acum=0;
        int cont=0;

        System.out.println("Quantas pessoas vao ser registradas: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for(int i=0;i<pessoas.length;i++){
            System.out.printf("Insira o dados da %d pessoa: \n",i+1);

            System.out.println("Insira o nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Insira a idade: ");
            int idade = sc.nextInt();

            System.out.println("Insira a altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome,altura,idade);
        }

        for(int i=0;i< pessoas.length;i++){
            acum =+ pessoas[i].getAltura();
        }
        double mediaH = acum/n;

        System.out.println("A lista de pessoas com menos de 16 anos: ");
        for(int i=0;i<pessoas.length;i++){
            if(pessoas[i].getIdade() < 16){
                System.out.printf("[%s] ",pessoas[i].getNome());
                cont = cont + 1;
            }
        }
        System.out.println("");

        System.out.printf("A media de altura eh: %.2f\n",mediaH);
        double porc = ((double)cont/n)*100;
        System.out.printf("A porcentagem de pessoas de 16 anos em relacao aos demais eh: %.2f",porc);


        sc.close();
    }
}
