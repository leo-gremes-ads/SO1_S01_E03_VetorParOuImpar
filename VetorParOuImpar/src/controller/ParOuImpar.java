package controller;

public class ParOuImpar
{
    public ParOuImpar()
    {
        super();
    }

    public void exibirParOuImpar(int[] vetor)
    {
        for (int n: vetor)
        {
            if (n % 2 == 1) {
                System.out.println(n + " é impar");
            }
            else {
                if (n % 10 == 0 && n != 0)
                System.out.println(n + " é par e múltiplo de 10");
            }
        }
    }
}
