public class Exercicio2 {

    private static int[] vetAux = new int[50];
    private static int p;

    public static long fibo(int n) {
             p = 1; // inicializa k
             return recursao(n);
           }

    private static long recursao(int n) {
            if (n < 0) {
               return vetAux[0];
          } else {
           if (p < 3) {
              vetAux[n] = p - 1;
              p++;
           } else {
                 vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
                 }
              return recursao(n - 1);
           }
    }

    public static void main(String[] args) {  // teste do programa. Imprime os 30 primeiros termos
    for (int i = 0; i < 30; i++) {
        System.out.print("(" + i + "):" + Exercicio2.fibo(i) + "\t");
        }
    }
}