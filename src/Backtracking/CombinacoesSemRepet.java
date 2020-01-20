package Backtracking;

public class CombinacoesSemRepet {

    static int[] presente;

    static void comb(int[] vet, int[] pres, int n, int k, int i) {

        if (i == k) {
            printvet(vet, k);
        } else {
            for (int j = 1; j <= n; j++) {
                if (presente[j] == 0) {
                    vet[i] = j;
                    presente[j] = 1;
                    comb(vet, pres, n, k, i + 1);
                    presente[j] = 0;

                }

            }
        }
    }

    private static void printvet(int[] vet, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf(vet[i] + " ");
        }
        System.out.println(" ");


    }

    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        int v[] = new int[k];
        presente = new int[n + 1];
        comb(v, presente, n, k, 0);
    }
}
