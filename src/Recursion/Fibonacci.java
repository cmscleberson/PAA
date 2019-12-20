package Recursion;

public class Fibonacci {


    static int fibIterat(int n)
    {
        int j = 0;
        int k = 1;
        for (int i=1; i<=n; i++)
        {
            int t = j+k;
            j = k;
            k = t;
        }
        return k;
    }


    static int fibRec(int n)
    {
        if(n<2)
        {
            return 1;
        }

        else
        {
            return fibRec(n-1)+fibRec(n-2);
        }

    }

    public static void main(String[] args) {
        System.out.println("Iterativo: "+fibIterat(6));
        System.out.println("Recursivo: "+fibRec(6));

    }

}
