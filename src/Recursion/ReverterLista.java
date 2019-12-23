package Recursion;

public class ReverterLista {


    //Print reverse vector elements with no recursion
    static void printRevert(int[] lista, int n)
    {

        if(n>=0)
        {
            System.out.println(lista[n]);

            printRevert(lista, n-1);
        }
    }




    //Print reverse vector elements using recursion

    static void revertVector(int[] lista, int m, int n)
    {

        if(m<n)
        {

            trocar(lista, m, n);
            revertVector(lista,m+1,n-1);



        }
    }

    private static void trocar(int[] lista, int m, int n) {

        int temp = lista[n];
        lista[n] = lista[m];
        lista[m] = temp;
    }

    static void mostraSolucao(int[] vet)
    {
        for (int i = 0; i<vet.length; i++)
        {
            System.out.println(vet[i]);
        }
    }





    public static void main(String[] args) {
        int lista[] = new int[4];
        for(int j=0; j<4; j++)
        {
            lista[j] = j;
        }
        System.out.println("Versão sem armazenamento: ");
        printRevert(lista, 3);


        System.out.println("Versão com armazenamento em vetor: ");


        revertVector(lista, 0,3);


        for (int j=0; j<lista.length; j++)
        {
            System.out.println(lista[j]);
        }



    }
}
