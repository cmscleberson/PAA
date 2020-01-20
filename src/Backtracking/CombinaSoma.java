package Backtracking;

import java.util.ArrayList;

public class CombinaSoma {
    static int soma = 0;

    static void combina(int numero, ArrayList<Integer> numeros) {
        if (soma == numero) {
            System.out.println(numeros);
        } else {
            for (int i = 1; i <= numero; i++) {
                soma += i;
                if (soma <= numero) {
                    numeros.add(i);
                    combina(numero, numeros);
                    numeros.remove(numeros.indexOf(i));
                }
                soma -= i;
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<>();

        combina(n, arr);


    }
}
