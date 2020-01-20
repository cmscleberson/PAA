package Recursion;

public class Palindromo {
    static int contador = 0;


    static void palindr(int[] vet, int ini, int fim) {
        if (ini < fim) {

            palindr(vet, ini + 1, fim - 1);
            if (vet[ini] == vet[fim]) {
                contador++;
            }

        }
    }

    static void ehPalindr(int[] vet, int n) {
        int val = 0;
        if (n % 2 == 0) {
            val = vet.length / 2;
        }
    }

    public static void main(String[] args) {
        int[] ve = {0, 1, 2, 1, 0};
        palindr(ve, 0, 4);
        System.out.println(contador);

    }
}
