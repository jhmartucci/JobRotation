package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    private int inicio = 0;
    private int countador = 1;
    private int aux = 0;
    List<Integer> fibonacci = new ArrayList<>();

    public List<Integer> calculaFibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números devemos considerar a sequencia de Fibonacci...: ");
        int tamanho = scanner.nextInt();
         for(int i = 0; i < tamanho; i++){
             fibonacci.add(inicio);
             aux = inicio;
             inicio += countador;
             countador = aux;
         }
         return fibonacci;
    }
    public void MostraSequenciaFibonacci(){
        System.out.println(fibonacci);
    }
    public void verificaNumeroNaSequencia(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual número devemos verificar se pertence a sequencia de Fibonacci...: ");
        int num = scanner.nextInt();

        if(fibonacci.contains(num)){
            System.out.println("O número " + num + " pertence a sequencia de Fibonacci");
        }else{
            System.out.println("O número " + num + " não pertence a sequencia de Fibonacci");
        }
    }

}
