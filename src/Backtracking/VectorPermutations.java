package Backtracking;

public class VectorPermutations {

    static void printArray(int[] vector, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(vector[i]);
        }
        System.out.println("\n");
    }

    static int[] swap(int[] vector, int i, int f) {
        int temp = vector[i];
        vector[i] = vector[f];
        vector[f] = temp;
        return vector;
    }

    static void solution(int[] vector, int i, int f) {
        if (i == f) {
            printArray(vector, f);
        }


        for (int j = i; j <= f; j++) {
            swap(vector, j, i);
            solution(vector, i + 1, f);
            swap(vector, j, i);
        }

    }

    public static void main(String[] args) {

        int[] v = {1, 2, 3};
        solution(v, 0, v.length - 1);

    }
}
