import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int nota;

        Scanner teclado = new Scanner(System.in);

        do {
            nota = teclado.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, digite novamente");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);

        teclado.close();

    }
}
