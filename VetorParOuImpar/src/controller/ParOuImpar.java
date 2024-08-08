package controller;

public class ParOuImpar
{
    public ParOuImpar()
    {
        super();
    }

    public void exibirParOuImpar(int[] vetor)
    {
        System.out.println("----------------------------");
        for (int n: vetor)
        {
            if (n % 2 != 0) {
                System.out.println(String.format("%11d", n) + " é impar");
            }
            else {
                if (n % 10 == 0)
                System.out.println(String.format("%11d", n) + " é par e múltiplo de 10");
            }
        }
        System.out.println("----------------------------");
    }
}
