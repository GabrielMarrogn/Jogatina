import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int qtd = sc.nextInt();
            int meu = sc.nextInt();
            int cont = 0;
            int[] arr = new int[qtd * 2];

            for (int i = 0; i < qtd * 2; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < qtd * 2; i++) {
                if (arr[i] != 1 && arr[i] != 0) {
                    if (arr[i] == meu && arr[i + 1] == 0) {
                        cont++;
                    }
                }
            }

            System.out.println(cont);
        }
        sc.close();
    }
}
