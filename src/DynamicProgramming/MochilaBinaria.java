package DynamicProgramming;

public class MochilaBinaria {

    static int mochila(int[][] memo, int[] pesos, int[] valores, int n, int pos, int cap) {
        if (pos == n || cap <= 0) {
            return 0;
        }

        if (memo[pos][cap] != -1) {
            return memo[pos][cap];
        }

        int r = mochila(memo, pesos, valores, n, pos + 1, cap);


        int aux;
        if (pesos[pos] <= cap) {
            aux = valores[pos] + mochila(memo, pesos, valores, n, pos + 1, cap - pesos[pos]);
            r = Math.max(r, aux);

        }
        memo[pos][cap] = r;

        return memo[pos][cap];
    }

    public static void main(String[] args) {
        int n = 4;
        int capacidade = 60;
        int[] pesos = {20, 40, 30, 15};
        int[] valores = {100, 450, 220, 180};


        int memoria[][] = new int[n + 1][capacidade + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < capacidade + 1; j++) {
                memoria[i][j] = -1;
            }
        }

        System.out.println(mochila(memoria, pesos, valores, n, 0, capacidade));


    }

}
