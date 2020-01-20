package Backtracking;

public class Sudoku {

    static int ehSeguro(int[][] matriz, int n, int linha, int coluna, int x) {
        //confere linha
        for (int i = 0; i < n; i++) {
            if (matriz[i][coluna] == x) {
                return 0;
            }
        }


        //confere coluna
        for (int j = 0; j < n; j++) {
            if (matriz[linha][j] == x) {
                return 0;
            }
        }

        //confere célula
        int tamCol = 3 * (coluna / 3);
        int tamLinhas = 3 * (linha / 3);

        for (int l = tamLinhas; l < tamLinhas + 3; l++) {
            for (int d = tamCol; d < tamCol + 3; d++) {
                if (matriz[l][d] == x) {
                    return 0;
                }
            }

        }

        return 1;

    }

    static boolean solve(int[][] matriz, int n, int linha, int coluna) {
        if (linha == matriz.length) {
            imprime(matriz, n);
            return true;
        } else {
            for (int k = 0; k < n; k++) {

                if (ehSeguro(matriz, n, linha, coluna, k) == 1) {
                    matriz[linha][coluna] = k;
                    solve(matriz, n, linha + 1, coluna);

                }
                matriz[linha][coluna] = 0;
                return true;
            }
        }
        return false;
    }

    static void imprime(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println(" ");
    }

}
