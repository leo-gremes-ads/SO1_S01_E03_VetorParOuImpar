package view;

import java.util.Scanner;

import controller.ParOuImpar;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ParOuImpar pi = new ParOuImpar();
        String txtNum;
        int tamanho = 0;
        do {
            System.out.print("Informe o tamanho do vetor: ");
            txtNum = s.nextLine();
            tamanho = validaTamanho(txtNum);
        } while (tamanho == 0);
        int[] vetor = new int[tamanho];
        int i = 0;
        while (i < tamanho) {
            System.out.print("Insira um valor no vetor(" + (i + 1) + "/" + tamanho + "): ");
            txtNum = s.nextLine();
            try {
                vetor[i] = Integer.parseInt(txtNum);
                i++;
            } catch (Exception e) {
                System.out.print("Valor inválido, tente novamente! ");
                continue;
            }
        }
        pi.exibirParOuImpar(vetor);
        s.close();
    }

    private static int validaTamanho(String txt)
    {
        try {
            int n = Integer.parseInt(txt);
            if (n >= 1 && n <= 100)
                return n;
            return 0;
        } catch (Exception e) {
            System.out.println("Tamanho inválido. Tente novamente!");
            return 0;
        }
    }
}
