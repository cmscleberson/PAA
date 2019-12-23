package Recursion;

public class SomaElementosVector {

    static int soma(int v[], int n) {
        if (n <= 0) {
            return v[n];
        } else {
            return v[n] + soma(v, n - 1);
        }

    }

    public static void main(String[] args) {

        int v[] = {10, 20, 30, 40};
        System.out.println(soma(v, v.length - 1));
    }
}
