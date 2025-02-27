package edu.giovana.sintaxejava;



import java.util.Scanner;

public class BoletimEstudantil {
    
    public static void main(String[] args) {
        int mediaFinal;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é a média final do aluno? ");
        mediaFinal = teclado.nextInt();

        if(mediaFinal < 6){
            System.out.println("REPROVADO");
        }
        else if (mediaFinal == 6){
            System.out.println("PROVA MINERVA");
        }
        else {
            System.out.println("APROVADO");
        }
    }
}
