package Recursion;

public class OcorrenciasDeKemC {
    static int ocorrencias(int k, int n, int i) {
        int div = n % 10;
        if (div == k) {
            i++;
        }

        if (n % k == n) {
            return i;
        }

        return ocorrencias(k, n / 10, i);
    }

    public static void main(String[] args) {
        System.out.println(ocorrencias(4, 24342, 0));
    }
}
