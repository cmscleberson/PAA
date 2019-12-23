package Recursion;

public class SomaAteN {

    static int soma(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + soma(n - 1);
        }


    }

    public static void main(String[] args) {
        System.out.println(soma(5));
    }
}
